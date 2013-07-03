/*-------------------------------------------------------------------------
 *
 * Copyright (c) 2005-2011, PostgreSQL Global Development Group
 *
 *
 *-------------------------------------------------------------------------
 */
package com.impossibl.postgres.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import junit.framework.TestCase;



/**
 * @author Michael Barker <mailto:mike@middlesoft.co.uk>
 * 
 */
public class BlobTest extends TestCase {
	Connection _conn;
	private final static String TABLE = "blobtest";
	private final static String INSERT = "INSERT INTO " + TABLE + " VALUES (1, lo_creat(-1))";
	private final static String SELECT = "SELECT ID, DATA FROM " + TABLE + " WHERE ID = 1";

	public BlobTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		_conn = TestUtil.openDB();
		TestUtil.createTable(_conn, TABLE, "ID INT PRIMARY KEY, DATA OID");
		_conn.setAutoCommit(false);
	}

	protected void tearDown() throws SQLException {
		_conn.setAutoCommit(true);
		TestUtil.dropTable(_conn, TABLE);
		TestUtil.closeDB(_conn);
	}

	/**
	 * Test the writing and reading of a single byte.
	 * 
	 * @throws SQLException
	 */
	public void test1Byte() throws SQLException {
		byte[] data = { (byte) 'a' };
		readWrite(data);
	}

	/**
	 * Test the writing and reading of a few bytes.
	 * 
	 * @throws SQLException
	 */
	public void testManyBytes() throws SQLException {
		byte[] data = "aaaaaaaaaa".getBytes();
		readWrite(data);
	}

	/**
	 * Test writing a single byte with an offset.
	 * 
	 * @throws SQLException
	 */
	public void test1ByteOffset() throws SQLException {
		byte[] data = { (byte) 'a' };
		readWrite(10, data);
	}

	/**
	 * Test the writing and reading of a few bytes with an offset.
	 * 
	 * @throws SQLException
	 */
	public void testManyBytesOffset() throws SQLException {
		byte[] data = "aaaaaaaaaa".getBytes();
		readWrite(10, data);
	}

	/**
	 * Tests all of the byte values from 0 - 255.
	 * 
	 * @throws SQLException
	 */
	public void testAllBytes() throws SQLException {
		byte[] data = new byte[256];
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) i;
		}
		readWrite(data);
	}

	public void testTruncate() throws SQLException {

		byte data[] = new byte[100];
		for (byte i = 0; i < data.length; i++) {
			data[i] = i;
		}
		readWrite(data);

		PreparedStatement ps = _conn.prepareStatement(SELECT);
		ResultSet rs = ps.executeQuery();

		assertTrue(rs.next());
		Blob blob = rs.getBlob("DATA");

		assertEquals(100, blob.length());

		blob.truncate(50);
		assertEquals(50, blob.length());

		blob.truncate(150);
		assertEquals(150, blob.length());

		data = blob.getBytes(1, 200);
		assertEquals(150, data.length);
		for (byte i = 0; i < 50; i++) {
			assertEquals(i, data[i]);
		}

		for (int i = 50; i < 150; i++) {
			assertEquals(0, data[i]);
		}
	}

	/**
	 * 
	 * @param data
	 * @throws SQLException
	 */
	public void readWrite(byte[] data) throws SQLException {
		readWrite(1, data);
	}

	/**
	 * 
	 * @param offset
	 * @param data
	 * @throws SQLException
	 */
	public void readWrite(int offset, byte[] data) throws SQLException {

		PreparedStatement ps = _conn.prepareStatement(INSERT);
		ps.executeUpdate();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		ResultSet rs = ps.executeQuery();

		assertTrue(rs.next());
		Blob b = rs.getBlob("DATA");
		b.setBytes(offset, data);

		rs.close();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		rs = ps.executeQuery();

		assertTrue(rs.next());
		b = rs.getBlob("DATA");
		byte[] rspData = b.getBytes(offset, data.length);
		assertTrue("Request should be the same as the response", Arrays.equals(data, rspData));

		rs.close();
		ps.close();
	}

	/**
	 * Test the writing and reading of a single byte.
	 * 
	 * @throws SQLException
	 * @throws IOException
	 */
	public void test1ByteStream() throws SQLException, IOException {
		byte[] data = { (byte) 'a' };
		readWriteStream(data);
	}

	/**
	 * Test the writing and reading of a few bytes.
	 * 
	 * @throws SQLException
	 * @throws IOException
	 */
	public void testManyBytesStream() throws SQLException, IOException {
		byte[] data = "aaaaaaaaaa".getBytes();
		readWriteStream(data);
	}

	/**
	 * Test writing a single byte with an offset.
	 * 
	 * @throws SQLException
	 * @throws IOException
	 */
	public void test1ByteOffsetStream() throws SQLException, IOException {
		byte[] data = { (byte) 'a' };
		readWriteStream(10, data);
	}

	/**
	 * Test the writing and reading of a few bytes with an offset.
	 * 
	 * @throws SQLException
	 * @throws IOException
	 */
	public void testManyBytesOffsetStream() throws SQLException, IOException {
		byte[] data = "aaaaaaaaaa".getBytes();
		readWriteStream(10, data);
	}

	/**
	 * Tests all of the byte values from 0 - 255.
	 * 
	 * @throws SQLException
	 * @throws IOException
	 */
	public void testAllBytesStream() throws SQLException, IOException {
		byte[] data = new byte[256];
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) i;
		}
		readWriteStream(data);
	}

	public void readWriteStream(byte[] data) throws SQLException, IOException {
		readWriteStream(1, data);
	}

	/**
	 * Reads then writes data to the blob via a stream.
	 * 
	 * @param offset
	 * @param data
	 * @throws SQLException
	 * @throws IOException
	 */
	public void readWriteStream(int offset, byte[] data) throws SQLException, IOException {

		PreparedStatement ps = _conn.prepareStatement(INSERT);
		ps.executeUpdate();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		ResultSet rs = ps.executeQuery();

		assertTrue(rs.next());
		Blob b = rs.getBlob("DATA");
		OutputStream out = b.setBinaryStream(offset);
		out.write(data);
		out.flush();
		out.close();

		rs.close();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		rs = ps.executeQuery();

		assertTrue(rs.next());
		b = rs.getBlob("DATA");
		InputStream in = b.getBinaryStream();
		byte[] rspData = new byte[data.length];
		in.skip(offset - 1);
		in.read(rspData);
		in.close();

		assertTrue("Request should be the same as the response", Arrays.equals(data, rspData));

		rs.close();
		ps.close();
	}

	public void testPattern() throws SQLException {
		byte[] data = "abcdefghijklmnopqrstuvwxyx0123456789".getBytes();
		byte[] pattern = "def".getBytes();

		PreparedStatement ps = _conn.prepareStatement(INSERT);
		ps.executeUpdate();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		ResultSet rs = ps.executeQuery();

		assertTrue(rs.next());
		Blob b = rs.getBlob("DATA");
		b.setBytes(1, data);

		rs.close();
		ps.close();

		ps = _conn.prepareStatement(SELECT);
		rs = ps.executeQuery();

		assertTrue(rs.next());
		b = rs.getBlob("DATA");
		long position = b.position(pattern, 1);
		byte[] rspData = b.getBytes(position, pattern.length);
		assertTrue("Request should be the same as the response", Arrays.equals(pattern, rspData));

		rs.close();
		ps.close();

	}
	
	public void testFree() throws SQLException {
		Statement stmt = _conn.createStatement();
		
		stmt.execute(INSERT);
		
		ResultSet rs = stmt.executeQuery("SELECT data FROM blobtest");
		assertTrue(rs.next());

		Blob blob = rs.getBlob(1);
		blob.free();
		try {
			blob.length();
			fail("Should have thrown an Exception because it was freed.");
		}
		catch (SQLException sqle) {
		}
	}
	
	public void testEOF() throws SQLException, IOException {
		Statement stmt = _conn.createStatement();
		
		stmt.execute(INSERT);
		
		ResultSet rs = stmt.executeQuery("SELECT data FROM blobtest");
		assertTrue(rs.next());

		Blob blob = rs.getBlob(1);
		
		InputStream in = blob.getBinaryStream();
		
		assertEquals(-1, in.read());
		assertEquals(-1, in.read(new byte[4], 0, 4));
	}
	
	public void testWrapper() throws SQLException {
		_conn.setAutoCommit(false);

		PreparedStatement stmt = _conn.prepareStatement("INSERT INTO blobtest VALUES (1, ?)");
		
		final Blob blob = _conn.createBlob();
		
		Blob wrapper = new Blob() {

			@Override
			public long length() throws SQLException {
				return blob.length();
			}

			@Override
			public byte[] getBytes(long pos, int length) throws SQLException {
				return blob.getBytes(pos, length);
			}

			@Override
			public InputStream getBinaryStream() throws SQLException {
				return blob.getBinaryStream();
			}

			@Override
			public long position(byte[] pattern, long start) throws SQLException {
				return blob.position(pattern, start);
			}

			@Override
			public long position(Blob pattern, long start) throws SQLException {
				return blob.position(pattern, start);
			}

			@Override
			public int setBytes(long pos, byte[] bytes) throws SQLException {
				return blob.setBytes(pos, bytes);
			}

			@Override
			public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
				return blob.setBytes(pos, bytes, offset, len);
			}

			@Override
			public OutputStream setBinaryStream(long pos) throws SQLException {
				return blob.setBinaryStream(pos);
			}

			@Override
			public void truncate(long len) throws SQLException {
				blob.truncate(len);
			}

			@Override
			public void free() throws SQLException {
				blob.free();
			}

			@Override
			public InputStream getBinaryStream(long pos, long length) throws SQLException {
				return blob.getBinaryStream(pos, length);
			}
			
		};
		
		stmt.setBlob(1, wrapper);
		
		stmt.execute();
		
		_conn.commit();
	}

}