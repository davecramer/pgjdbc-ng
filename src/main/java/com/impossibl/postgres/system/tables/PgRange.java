/**
 * Copyright (c) 2013, impossibl.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of impossibl.com nor the names of its contributors may
 *    be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.impossibl.postgres.system.tables;

import com.impossibl.postgres.protocol.RowData;
import com.impossibl.postgres.system.Context;
import com.impossibl.postgres.system.Version;

import java.io.IOException;
import java.util.Objects;

public class PgRange implements Table<PgRange.Row> {
  @Override
  public String getSQL(Version currentVersion) {
    return "select rngtypid, rngsubtype, rngmultitypid from pg_range";
  }

  @Override
  public Row createRow(Context context, RowData rowData) throws IOException {
    PgRange.Row row = new PgRange.Row();
    row.load(context, rowData);
    return row;
  }

  public static class Row implements Table.Row {
    private int rangeTypeId;
    private int baseTypeId;
    private int multiRangeTypeId;
    public Row() {
    }

    @Override
    public void load(Context context, RowData rowData) throws IOException {
      this.rangeTypeId = rowData.getColumn(RANGE_TYPE_ID, context, Integer.class);
      this.baseTypeId = rowData.getColumn(BASE_TYPE_ID, context, Integer.class);
      this.multiRangeTypeId = rowData.getColumn(MULTI_RANGE_TYPE_ID, context, Integer.class);
    }

    public int getRangeTypeId() {
      return rangeTypeId;
    }

    public void setRangeTypeId(int rangeTypeId) {
      this.rangeTypeId = rangeTypeId;
    }

    public int getBaseTypeId() {
      return baseTypeId;
    }

    public void setBaseTypeId(int baseTypeId) {
      this.baseTypeId = baseTypeId;
    }

    public int getMultiRangeTypeId() {
      return multiRangeTypeId;
    }

    public void setMultiRangeTypeId(int multiRangeTypeId) {
      this.multiRangeTypeId = multiRangeTypeId;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Row row = (Row) o;
      return rangeTypeId == row.rangeTypeId && baseTypeId == row.baseTypeId && multiRangeTypeId == row.multiRangeTypeId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(rangeTypeId, baseTypeId, multiRangeTypeId);
    }
  }
  private static int RANGE_TYPE_ID = 0;
  private static int BASE_TYPE_ID = 1;
  private static int MULTI_RANGE_TYPE_ID = 2;

  private PgRange() {

  }
  public static final PgRange INSTANCE = new PgRange();
}
