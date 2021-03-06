public class Problem001 {

  public static void main(String[] args) {

    int MAX = 1000;

    boolean[] multiple = new boolean[MAX];

    for (int i = 0; i < MAX; i += 3)
      multiple[i] = true;

    for (int i = 0; i < MAX; i += 5)
      multiple[i] = true;

    int sum = 0;

    for (int i = 0; i < MAX; i++)
      if (multiple[i])
        sum += i;

    System.out.println(sum);

    return;
  }
}
