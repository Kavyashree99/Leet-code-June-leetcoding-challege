class Solution {
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    LinkedList<String> list = new LinkedList<>();
    public List<String> findItinerary(List<List<String>> t) {
        for(List<String> e : t){
            String from = e.get(0), to = e.get(1);
            if(!map.containsKey(from))
                map.put(from, new PriorityQueue<>());
            map.get(from).add(to);
        }
        itineraryHelper("JFK");
        return list;
    }
    private void itineraryHelper(String str){
        PriorityQueue<String> pq = map.get(str);
        while(pq != null && !pq.isEmpty())
            itineraryHelper(pq.poll());
        list.addFirst(str);
    }
}
