class Solution {
    public String predictPartyVictory(String senate) {

        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        int i = 0;

        for (Character c : senate.toCharArray()) {
            if (c == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
            i++;
        }

        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            Integer rIndex = rQueue.poll();
            Integer dIndex = dQueue.poll();

            if (rIndex < dIndex) {
                rQueue.offer(rIndex + senate.length());
            } else {
                dQueue.offer(dIndex + senate.length());
            }
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";

    }
}