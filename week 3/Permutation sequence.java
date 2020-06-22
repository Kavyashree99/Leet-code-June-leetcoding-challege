class Solution {
    public String getPermutation(int n, int k) {

    int[] factorial = new int[n];
    int i;
    StringBuilder sb = new StringBuilder();
    ArrayList<Integer> num = new ArrayList<Integer>();

    for (i = 0; i < n; i++) {
        num.add(i + 1);
        factorial[i] = i == 0 ? 1 : i * factorial[i - 1];
    }

    while (n > 0) {
        int remaining = ((k - 1) % factorial[n - 1]) + 1;
        sb.append(num.remove(((k - 1) / factorial[n - 1])));
        n--;
        k = remaining;
    }

    return sb.toString();

}
}
