public boolean loneTeen(int a, int b) {
  boolean A=(a>=13 && a<=19);
  boolean B=(b>=13 && b<=19);
  return (A && !B) || (!A && B);

}
