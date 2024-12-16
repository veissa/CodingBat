// idk if i already shared another verion of the solution using charAt, but thatis not so optimal though, thus here i am :
public String backAround(String str) {
  return str.substring(str.length()-1)+str+str.substring(str.length()-1);
}
// using substring is generally better!
