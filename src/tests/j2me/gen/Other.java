// Generated by the protocol buffer compiler.  DO NOT EDIT!

public  final class Other extends
    com.google.protobuf.Message {
  public Other() {
    super("Other");
    initFields();
  }
  private Other(boolean noInit) { super(true); }
  
  private static final Other defaultInstance;
  public static Other getDefaultInstance() {
    return defaultInstance;
  }
  
  public Other getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  private void initFields() {
  }
  public final boolean isInitialized() {
    return true;
  }
  
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Other)) return false;
    Other msg = (Other)obj;
    return true;
  }
  
  public int hashCode() {
    int hash = 41 * getClass().getName().hashCode();
    return hash;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
  }
  
  public int getSerializedSize() {
    int size = 0;
    return size;
  }
  
  public static Other parseFrom(
      java.io.InputStream input)
      throws java.io.IOException {
    com.google.protobuf.CodedInputStream codedInput =
        com.google.protobuf.CodedInputStream.newInstance(input);
    return parseFrom(codedInput);
  }
  
  public static Other parseFrom(
      com.google.protobuf.CodedInputStream codedInput)
      throws java.io.IOException {
    Other proto = new Other();
    proto.mergeFrom(codedInput);
    return proto;
  }
  
  public com.google.protobuf.Message newInstance() {
    return new Other();
  }
  
  public void mergeFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    assertNotReadOnly();
    while (true) {
      int tag = input.readTag();
      switch (tag) {
        case 0:
          return;
        default: {
          if (!parseUnknownField(input, tag)) {
            return;
          }
          break;
        }
      }
    }
  }
  
  
  static {
    defaultInstance = new Other(true);
    HelloWorld.internalForceInit();
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:Other)
}

