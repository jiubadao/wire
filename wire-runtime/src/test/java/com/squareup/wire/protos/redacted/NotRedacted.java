// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/redacted_test.proto at 22:1
package com.squareup.wire.protos.redacted;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class NotRedacted extends Message<NotRedacted> {
  public static final ProtoAdapter<NotRedacted> ADAPTER = ProtoAdapter.forMessage(NotRedacted.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_A = "";

  public static final String DEFAULT_B = "";

  @WireField(
      tag = 1,
      type = "string"
  )
  public final String a;

  @WireField(
      tag = 2,
      type = "string"
  )
  public final String b;

  public NotRedacted(String a, String b) {
    this.a = a;
    this.b = b;
  }

  private NotRedacted(Builder builder) {
    this(builder.a, builder.b);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NotRedacted)) return false;
    NotRedacted o = (NotRedacted) other;
    return equals(a, o.a)
        && equals(b, o.b);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = a != null ? a.hashCode() : 0;
      result = result * 37 + (b != null ? b.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<NotRedacted, Builder> {
    public String a;

    public String b;

    public Builder() {
    }

    public Builder(NotRedacted message) {
      super(message);
      if (message == null) return;
      this.a = message.a;
      this.b = message.b;
    }

    public Builder a(String a) {
      this.a = a;
      return this;
    }

    public Builder b(String b) {
      this.b = b;
      return this;
    }

    @Override
    public NotRedacted build() {
      return new NotRedacted(this);
    }
  }
}
