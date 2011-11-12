// Generated by the protocol buffer compiler.  DO NOT EDIT!

public  final class Foo extends
    com.google.protobuf.Message {
  private int set_mask_0_;
  public Foo() {
    super("Foo");
    initFields();
  }
  private Foo(boolean noInit) { super(true); }
  
  private static final Foo defaultInstance;
  public static Foo getDefaultInstance() {
    return defaultInstance;
  }
  
  public Foo getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  // required int32 reqint = 1;
  private int reqint_ = 0;
  public int getReqint() { return reqint_; }
  public boolean hasReqint() { return (set_mask_0_ & 1) != 0; }
  public void clearReqint() {
    assertNotReadOnly();
    set_mask_0_ &= ~1;
    reqint_ = 0;
  }
  public void setReqint(int value) {
    assertNotReadOnly();
    set_mask_0_ |= 1;
    reqint_ = value;
  }
  
  // optional int32 optint = 2;
  private int optint_ = 0;
  public int getOptint() { return optint_; }
  public boolean hasOptint() { return (set_mask_0_ & 2) != 0; }
  public void clearOptint() {
    assertNotReadOnly();
    set_mask_0_ &= ~2;
    optint_ = 0;
  }
  public void setOptint(int value) {
    assertNotReadOnly();
    set_mask_0_ |= 2;
    optint_ = value;
  }
  
  // repeated int32 repint = 3;
  private int[] repint_ = new int[0];
  private int repintCount_;
  public int getRepintCount() { return repintCount_; }
  public int getRepint(int index) {
    return repint_[index];
  }
  public void reserveRepint(int size) {
    if (size >= repint_.length) {
      int[] copy = new int[size];
      System.arraycopy(repint_, 0, copy, 0, repintCount_);
      repint_ = copy;
    }
  }
  public void setRepint(int index, int value) {
    assertNotReadOnly();
    repint_[index] = value;
  }
  public void addRepint(int value) {
    assertNotReadOnly();
    reserveRepint(repintCount_ + 1);
    repint_[repintCount_++] = value;
  }
  public void swapRepint(int index1, int index2) {
    assertNotReadOnly();
    int swp = repint_[index1];
    repint_[index1] = repint_[index2];
    repint_[index2] = swp;
  }
  public void removeLastRepint() {
    assertNotReadOnly();
    if (repintCount_ > 0) {
      repint_[repintCount_--] = 0;
    }
  }
  public void clearRepint() {
    assertNotReadOnly();
    while (repintCount_ > 0) {
      repint_[repintCount_--] = 0;
    }
  }
  
  // required bool reqbool = 4;
  private boolean reqbool_ = false;
  public boolean getReqbool() { return reqbool_; }
  public boolean hasReqbool() { return (set_mask_0_ & 8) != 0; }
  public void clearReqbool() {
    assertNotReadOnly();
    set_mask_0_ &= ~8;
    reqbool_ = false;
  }
  public void setReqbool(boolean value) {
    assertNotReadOnly();
    set_mask_0_ |= 8;
    reqbool_ = value;
  }
  
  // optional bool optbool = 5;
  private boolean optbool_ = false;
  public boolean getOptbool() { return optbool_; }
  public boolean hasOptbool() { return (set_mask_0_ & 16) != 0; }
  public void clearOptbool() {
    assertNotReadOnly();
    set_mask_0_ &= ~16;
    optbool_ = false;
  }
  public void setOptbool(boolean value) {
    assertNotReadOnly();
    set_mask_0_ |= 16;
    optbool_ = value;
  }
  
  // repeated bool repbool = 6;
  private boolean[] repbool_ = new boolean[0];
  private int repboolCount_;
  public int getRepboolCount() { return repboolCount_; }
  public boolean getRepbool(int index) {
    return repbool_[index];
  }
  public void reserveRepbool(int size) {
    if (size >= repbool_.length) {
      boolean[] copy = new boolean[size];
      System.arraycopy(repbool_, 0, copy, 0, repboolCount_);
      repbool_ = copy;
    }
  }
  public void setRepbool(int index, boolean value) {
    assertNotReadOnly();
    repbool_[index] = value;
  }
  public void addRepbool(boolean value) {
    assertNotReadOnly();
    reserveRepbool(repboolCount_ + 1);
    repbool_[repboolCount_++] = value;
  }
  public void swapRepbool(int index1, int index2) {
    assertNotReadOnly();
    boolean swp = repbool_[index1];
    repbool_[index1] = repbool_[index2];
    repbool_[index2] = swp;
  }
  public void removeLastRepbool() {
    assertNotReadOnly();
    if (repboolCount_ > 0) {
      repbool_[repboolCount_--] = false;
    }
  }
  public void clearRepbool() {
    assertNotReadOnly();
    while (repboolCount_ > 0) {
      repbool_[repboolCount_--] = false;
    }
  }
  
  // required string reqstr = 7;
  private java.lang.String reqstr_ = "";
  public java.lang.String getReqstr() { return reqstr_; }
  public boolean hasReqstr() { return (set_mask_0_ & 64) != 0; }
  public void clearReqstr() {
    assertNotReadOnly();
    set_mask_0_ &= ~64;
    reqstr_ = "";
  }
  public void setReqstr(java.lang.String value) {
    assertNotReadOnly();
    set_mask_0_ |= 64;
    reqstr_ = value;
  }
  
  // optional string optstr = 8;
  private java.lang.String optstr_ = "";
  public java.lang.String getOptstr() { return optstr_; }
  public boolean hasOptstr() { return (set_mask_0_ & 128) != 0; }
  public void clearOptstr() {
    assertNotReadOnly();
    set_mask_0_ &= ~128;
    optstr_ = "";
  }
  public void setOptstr(java.lang.String value) {
    assertNotReadOnly();
    set_mask_0_ |= 128;
    optstr_ = value;
  }
  
  // repeated string repstr = 9;
  private java.lang.String[] repstr_ = new java.lang.String[0];
  private int repstrCount_;
  public int getRepstrCount() { return repstrCount_; }
  public java.lang.String getRepstr(int index) {
    return repstr_[index];
  }
  public void reserveRepstr(int size) {
    if (size >= repstr_.length) {
      java.lang.String[] copy = new java.lang.String[size];
      System.arraycopy(repstr_, 0, copy, 0, repstrCount_);
      repstr_ = copy;
    }
  }
  public void setRepstr(int index, java.lang.String value) {
    assertNotReadOnly();
    repstr_[index] = value;
  }
  public void addRepstr(java.lang.String value) {
    assertNotReadOnly();
    reserveRepstr(repstrCount_ + 1);
    repstr_[repstrCount_++] = value;
  }
  public void swapRepstr(int index1, int index2) {
    assertNotReadOnly();
    java.lang.String swp = repstr_[index1];
    repstr_[index1] = repstr_[index2];
    repstr_[index2] = swp;
  }
  public void removeLastRepstr() {
    assertNotReadOnly();
    if (repstrCount_ > 0) {
      repstr_[repstrCount_--] = "";
    }
  }
  public void clearRepstr() {
    assertNotReadOnly();
    while (repstrCount_ > 0) {
      repstr_[repstrCount_--] = "";
    }
  }
  
  // required .Person reqper = 10;
  private Person reqper_;
  public Person getReqper() { return reqper_; }
  public boolean hasReqper() { return (set_mask_0_ & 512) != 0; }
  public void clearReqper() {
    assertNotReadOnly();
    set_mask_0_ &= ~512;
    reqper_ = Person.getDefaultInstance();
  }
  public void setReqper(Person value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    set_mask_0_ |= 512;
    reqper_ = value;
  }
  
  // optional .Person optper = 11;
  private Person optper_;
  public Person getOptper() { return optper_; }
  public boolean hasOptper() { return (set_mask_0_ & 1024) != 0; }
  public void clearOptper() {
    assertNotReadOnly();
    set_mask_0_ &= ~1024;
    optper_ = Person.getDefaultInstance();
  }
  public void setOptper(Person value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    set_mask_0_ |= 1024;
    optper_ = value;
  }
  
  // repeated .Person repper = 12;
  private java.util.Vector repper_ = new java.util.Vector();
  public java.util.Enumeration getRepperEnum() {
    return repper_.elements();
  }
  public int getRepperCount() { return repper_.size(); }
  public Person getRepper(int index) {
    return (Person) repper_.elementAt(index);
  }
  public void setRepper(int index, Person value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    repper_.setElementAt(value, index);
  }
  public void addRepper(Person value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    repper_.addElement(value);
  }
  public void swapRepper(int index1, int index2) {
    assertNotReadOnly();
    Object swp = repper_.elementAt(index1);
    repper_.setElementAt(repper_.elementAt(index2), index1);
    repper_.setElementAt(swp, index2);
  }
  public void removeLastRepper() {
    assertNotReadOnly();
    if (repper_.size() > 0) {
      repper_.removeElementAt(repper_.size() - 1);
    }
  }
  public void clearRepper() {
    assertNotReadOnly();
    repper_.removeAllElements();
  }
  
  // required .Person.PhoneType reqpho = 13;
  private Person.PhoneType reqpho_;
  public Person.PhoneType getReqpho() { return reqpho_; }
  public boolean hasReqpho() { return (set_mask_0_ & 4096) != 0; }
  public void clearReqpho() {
    assertNotReadOnly();
    set_mask_0_ &= ~4096;
    reqpho_ = Person.PhoneType.MOBILE;
  }
  public void setReqpho(Person.PhoneType value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    set_mask_0_ |= 4096;
    reqpho_ = value;
  }
  
  // optional .Person.PhoneType toppho = 14;
  private Person.PhoneType toppho_;
  public Person.PhoneType getToppho() { return toppho_; }
  public boolean hasToppho() { return (set_mask_0_ & 8192) != 0; }
  public void clearToppho() {
    assertNotReadOnly();
    set_mask_0_ &= ~8192;
    toppho_ = Person.PhoneType.MOBILE;
  }
  public void setToppho(Person.PhoneType value) {
    assertNotReadOnly();
    if (value == null) {
      throw new NullPointerException();
    }
    set_mask_0_ |= 8192;
    toppho_ = value;
  }
  
  // repeated .Person.PhoneType reppho = 15;
  private Person.PhoneType[] reppho_ = new Person.PhoneType[0];
  private int repphoCount_;
  public int getRepphoCount() { return repphoCount_; }
  public Person.PhoneType getReppho(int index) {
    return reppho_[index];
  }
  public void reserveReppho(int size) {
    if (size >= reppho_.length) {
      Person.PhoneType[] copy = new Person.PhoneType[size];
      System.arraycopy(reppho_, 0, copy, 0, repphoCount_);
      reppho_ = copy;
    }
  }
  public void setReppho(int index, Person.PhoneType value) {
    assertNotReadOnly();
    reppho_[index] = value;
  }
  public void addReppho(Person.PhoneType value) {
    assertNotReadOnly();
    reserveReppho(repphoCount_ + 1);
    reppho_[repphoCount_++] = value;
  }
  public void swapReppho(int index1, int index2) {
    assertNotReadOnly();
    Person.PhoneType swp = reppho_[index1];
    reppho_[index1] = reppho_[index2];
    reppho_[index2] = swp;
  }
  public void removeLastReppho() {
    assertNotReadOnly();
    if (repphoCount_ > 0) {
      reppho_[repphoCount_--] = Person.PhoneType.MOBILE;
    }
  }
  public void clearReppho() {
    assertNotReadOnly();
    while (repphoCount_ > 0) {
      reppho_[repphoCount_--] = Person.PhoneType.MOBILE;
    }
  }
  
  // optional int32 hightag = 120;
  private int hightag_ = 0;
  public int getHightag() { return hightag_; }
  public boolean hasHightag() { return (set_mask_0_ & 32768) != 0; }
  public void clearHightag() {
    assertNotReadOnly();
    set_mask_0_ &= ~32768;
    hightag_ = 0;
  }
  public void setHightag(int value) {
    assertNotReadOnly();
    set_mask_0_ |= 32768;
    hightag_ = value;
  }
  
  private void initFields() {
    reqper_ = Person.getDefaultInstance();
    optper_ = Person.getDefaultInstance();
    reqpho_ = Person.PhoneType.MOBILE;
    toppho_ = Person.PhoneType.MOBILE;
  }
  public final boolean isInitialized() {
    if (!hasReqint) return false;
    if (!hasReqbool) return false;
    if (!hasReqstr) return false;
    if (!hasReqper) return false;
    if (!hasReqpho) return false;
    if (!getReqper().isInitialized()) return false;
    if (hasOptper()) {
      if (!getOptper().isInitialized()) return false;
    }
    for (int i = 0; i < getRepperCount(); i++) {
      Person element = getRepper(i);
      if (!element.isInitialized()) return false;
    }
    return true;
  }
  
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Foo)) return false;
    Foo msg = (Foo)obj;
    if (reqint_ != msg.reqint_) {
      return false;
    }
    if (optint_ != msg.optint_) {
      return false;
    }
    if (repint_.length != msg.repint_.length) return false;
    for (int j = 0; j < repint_.length; j++) {
      if (repint_[j] != msg.repint_[j]) {
        return false;
      }
    }
    if (reqbool_ != msg.reqbool_) {
      return false;
    }
    if (optbool_ != msg.optbool_) {
      return false;
    }
    if (repbool_.length != msg.repbool_.length) return false;
    for (int j = 0; j < repbool_.length; j++) {
      if (repbool_[j] != msg.repbool_[j]) {
        return false;
      }
    }
    if (!reqstr_.equals(msg.reqstr_)) {
      return false;
    }
    if (!optstr_.equals(msg.optstr_)) {
      return false;
    }
    if (repstr_.length != msg.repstr_.length) return false;
    for (int j = 0; j < repstr_.length; j++) {
      if (!repstr_[j].equals(msg.repstr_[j])) {
        return false;
      }
    }
    if (!reqper_.equals(msg.reqper_)) {
      return false;
    }
    if (!optper_.equals(msg.optper_)) {
      return false;
    }
    if (repper_.size() != msg.repper_.size()) return false;
    for (int j = 0; j < repper_.size(); j++) {
      if (!repper_.elementAt(j).equals(msg.repper_.elementAt(j))) {
        return false;
      }
    }
    if (reqpho_ != msg.reqpho_) {
      return false;
    }
    if (toppho_ != msg.toppho_) {
      return false;
    }
    if (reppho_.length != msg.reppho_.length) return false;
    for (int j = 0; j < reppho_.length; j++) {
      if (reppho_[j] != msg.reppho_[j]) {
        return false;
      }
    }
    if (hightag_ != msg.hightag_) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    int hash = 41 * getClass().getName().hashCode();
    if (hasReqint()) hash += 33 * reqint_;
    if (hasOptint()) hash += 33 * optint_;
    for (int j = 0; j < repint_.length; j++) {
      hash += 19 * repint_[j];
    }
    if (hasReqbool()) hash += 33 * (reqbool_ ? 1 : 0);
    if (hasOptbool()) hash += 33 * (optbool_ ? 1 : 0);
    for (int j = 0; j < repbool_.length; j++) {
      hash += repbool_[j] ? 19 : 17;
    }
    if (hasReqstr()) hash += 31 * reqstr_.hashCode();
    if (hasOptstr()) hash += 31 * optstr_.hashCode();
    for (int j = 0; j < repstr_.length; j++) {
      hash += 19 * repstr_[j].hashCode();
    }
    if (hasReqper())   hash += 31 * reqper_.hashCode();
    if (hasOptper())   hash += 31 * optper_.hashCode();
    for (int j = 0; j < repper_.size(); j++) {
      hash += 17 * repper_.elementAt(j).hashCode();
    }
    if (hasReqpho())  hash += 37 * reqpho_.hashCode();
    if (hasToppho())  hash += 37 * toppho_.hashCode();
    for (int j = 0; j < reppho_.length; j++) {
      hash += 13 * reppho_[j].getValue();
    }
    if (hasHightag()) hash += 33 * hightag_;
    return hash;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (hasReqint()) {
      output.writeInt32(1, getReqint());
    }
    if (hasOptint()) {
      output.writeInt32(2, getOptint());
    }
    for (int i = 0; i < getRepintCount(); i++) {
      int element = getRepint(i);
      output.writeInt32(3, element);
    }
    if (hasReqbool()) {
      output.writeBool(4, getReqbool());
    }
    if (hasOptbool()) {
      output.writeBool(5, getOptbool());
    }
    for (int i = 0; i < getRepboolCount(); i++) {
      boolean element = getRepbool(i);
      output.writeBool(6, element);
    }
    if (hasReqstr()) {
      output.writeString(7, getReqstr());
    }
    if (hasOptstr()) {
      output.writeString(8, getOptstr());
    }
    for (int i = 0; i < getRepstrCount(); i++) {
      java.lang.String element = getRepstr(i);
      output.writeString(9, element);
    }
    if (hasReqper()) {
      output.writeMessage(10, getReqper());
    }
    if (hasOptper()) {
      output.writeMessage(11, getOptper());
    }
    for (int i = 0; i < getRepperCount(); i++) {
      Person element = getRepper(i);
      output.writeMessage(12, element);
    }
    if (hasReqpho()) {
      output.writeEnum(13, getReqpho().getValue());
    }
    if (hasToppho()) {
      output.writeEnum(14, getToppho().getValue());
    }
    for (int i = 0; i < getRepphoCount(); i++) {
      Person.PhoneType element = getReppho(i);
      output.writeEnum(15, element.getValue());
    }
    if (hasHightag()) {
      output.writeInt32(120, getHightag());
    }
  }
  
  public int getSerializedSize() {
    int size = 0;
    if (hasReqint()) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, getReqint());
    }
    if (hasOptint()) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, getOptint());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < getRepintCount(); i++) {
        int element = getRepint(i);
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(element);
      }
      size += dataSize;
      size += 1 * getRepintCount();
    }
    if (hasReqbool()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, getReqbool());
    }
    if (hasOptbool()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, getOptbool());
    }
    {
      int dataSize = 0;
      dataSize = 1 * getRepboolCount();
      size += dataSize;
      size += 1 * getRepboolCount();
    }
    if (hasReqstr()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(7, getReqstr());
    }
    if (hasOptstr()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(8, getOptstr());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < getRepstrCount(); i++) {
        java.lang.String element = getRepstr(i);
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(element);
      }
      size += dataSize;
      size += 1 * getRepstrCount();
    }
    if (hasReqper()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getReqper());
    }
    if (hasOptper()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, getOptper());
    }
    for (int i = 0; i < getRepperCount(); i++) {
      Person element = getRepper(i);
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, element);
    }
    if (hasReqpho()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(13, getReqpho().getValue());
    }
    if (hasToppho()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(14, getToppho().getValue());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < getRepphoCount(); i++) {
        Person.PhoneType element = getReppho(i);
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(element.getValue());
      }
      size += dataSize;
      size += 1 * getRepphoCount();
    }
    if (hasHightag()) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(120, getHightag());
    }
    return size;
  }
  
  public static Foo parseFrom(
      java.io.InputStream input)
      throws java.io.IOException {
    com.google.protobuf.CodedInputStream codedInput =
        com.google.protobuf.CodedInputStream.newInstance(input);
    return parseFrom(codedInput);
  }
  
  public static Foo parseFrom(
      com.google.protobuf.CodedInputStream codedInput)
      throws java.io.IOException {
    Foo proto = new Foo();
    proto.mergeFrom(codedInput);
    return proto;
  }
  
  public com.google.protobuf.Message newInstance() {
    return new Foo();
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
        case 8: {
          setReqint(input.readInt32());
          break;
        }
        case 16: {
          setOptint(input.readInt32());
          break;
        }
        case 24: {
          addRepint(input.readInt32());
          break;
        }
        case 26: {
          int length = input.readRawVarint32();
          reserveRepint(length);
          int limit = input.pushLimit(length);
          while (input.getBytesUntilLimit() > 0) {
            addRepint(input.readInt32());
          }
          input.popLimit(limit);
          break;
        }
        case 32: {
          setReqbool(input.readBool());
          break;
        }
        case 40: {
          setOptbool(input.readBool());
          break;
        }
        case 48: {
          addRepbool(input.readBool());
          break;
        }
        case 50: {
          int length = input.readRawVarint32();
          reserveRepbool(length);
          int limit = input.pushLimit(length);
          while (input.getBytesUntilLimit() > 0) {
            addRepbool(input.readBool());
          }
          input.popLimit(limit);
          break;
        }
        case 58: {
          setReqstr(input.readString());
          break;
        }
        case 66: {
          setOptstr(input.readString());
          break;
        }
        case 74: {
          addRepstr(input.readString());
          break;
        }
        case 82: {
          if (!hasReqper()) {
            setReqper(new Person());
          }
          input.readMessage(getReqper());
          break;
        }
        case 90: {
          if (!hasOptper()) {
            setOptper(new Person());
          }
          input.readMessage(getOptper());
          break;
        }
        case 98: {
          Person msg = new Person();
          input.readMessage(msg);
          addRepper(msg);
          break;
        }
        case 104: {
          int rawValue = input.readEnum();
          Person.PhoneType value = Person.PhoneType.valueOf(rawValue);
          if (value != null) {
            setReqpho(value);
          }
          break;
        }
        case 112: {
          int rawValue = input.readEnum();
          Person.PhoneType value = Person.PhoneType.valueOf(rawValue);
          if (value != null) {
            setToppho(value);
          }
          break;
        }
        case 120: {
          int rawValue = input.readEnum();
          Person.PhoneType value = Person.PhoneType.valueOf(rawValue);
          if (value != null) {
            addReppho(value);
          }
          break;
        }
        case 122: {
          int length = input.readRawVarint32();
          int oldLimit = input.pushLimit(length);
          while(input.getBytesUntilLimit() > 0) {
            int rawValue = input.readEnum();
            Person.PhoneType value = Person.PhoneType.valueOf(rawValue);
            if (value != null) {
              addReppho(value);
            }
          }
          input.popLimit(oldLimit);
          break;
        }
        case 960: {
          setHightag(input.readInt32());
          break;
        }
      }
    }
  }
  
  
  static {
    defaultInstance = new Foo(true);
    Example1.internalForceInit();
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:Foo)
}

