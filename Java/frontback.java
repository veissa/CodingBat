public String frontBack(String str) {
  if(str.length()<=1) return str;
  return str.charAt(str.length()-1)+str.substring(0,str.length()-1)+str.charAt(0);
}
