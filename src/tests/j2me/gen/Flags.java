// Generated by the protocol buffer compiler.  DO NOT EDIT!

public  final class Flags
    extends com.google.protobuf.EnumType {
  public static final int VAL0_VALUE = 0;
  public static final Flags VAL0 = 
      new Flags(VAL0_VALUE, "VAL0");
  public static final int VAL1_VALUE = 1;
  public static final Flags VAL1 = 
      new Flags(VAL1_VALUE, "VAL1");
  public static final int VAL2_VALUE = 2;
  public static final Flags VAL2 = 
      new Flags(VAL2_VALUE, "VAL2");
  public static Flags valueOf(int value) {
    switch (value) {
      case VAL0_VALUE: return VAL0;
      case VAL1_VALUE: return VAL1;
      case VAL2_VALUE: return VAL2;
      default: throw new IllegalArgumentException(Integer.toString(value));
    }
  }
  
  private static Flags[] _VALUES = new Flags[] {
    VAL0,
    VAL1,
    VAL2,
  };
  public static Flags[] values() {
    return _VALUES;
  }
  
  private Flags(int value, String name) {
    super(value, name);
  }
  
  public com.google.protobuf.EnumType getEnum(int value) {
    return Flags.valueOf(value);
  }
  
  // @@protoc_insertion_point(enum_scope:Flags)
}

