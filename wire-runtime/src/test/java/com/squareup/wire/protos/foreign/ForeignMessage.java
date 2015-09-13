// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/foreign.proto at 28:1
package com.squareup.wire.protos.foreign;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;

public final class ForeignMessage extends Message<ForeignMessage> {
  public static final ProtoAdapter<ForeignMessage> ADAPTER = ProtoAdapter.forMessage(ForeignMessage.class);

  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  @WireField(
      tag = 1,
      type = "int32"
  )
  public final Integer i;

  public ForeignMessage(Integer i) {
    this.i = i;
  }

  private ForeignMessage(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ForeignMessage)) return false;
    ForeignMessage o = (ForeignMessage) other;
    if (!extensionsEqual(o)) return false;
    return equals(i, o.i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<ForeignMessage, Builder> {
    public Integer i;

    public Builder() {
    }

    public Builder(ForeignMessage message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public ForeignMessage build() {
      return new ForeignMessage(this);
    }
  }
}
