package assigment1;

//Write a program find if String is Palindrome?
class isPalindrome {
  public boolean isPalindrome(String s) {
    StringBuffer sgood = new StringBuffer();
    for (int i = 0; i < s.length() - 1; i++) {
      char ch = s.charAt(i);
      if (Character.isLetterOrDigit(ch)) {
        sgood.append(Character.toLowerCase(ch));
      }
    }
    StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
    return sgood.toString().equals(sgood_rev.toString());
  }
}
