# StringBuilder
✔️ StringBuilder Class는 String 객체와 다르게 변경 가능한(mutable) 문자열
```
public class Main
{
  public static void main(String[] args)
  {
    StringBuilder ex = new StringBuilder();
    ex.append("java!"); // 추가
    ex.insert(0, " "); // 삽입
    ex.delete(0, 4); // 삭제
    ex.deleteCharAt(0);
    ex.replace(0, 1, "Y"); // 변경
    ex.reverse(); // 뒤집기

    System.out.print(ex);
  }
}
```
