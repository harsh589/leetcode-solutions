class RandomizedSet {

ArrayList<Integer> list;
    public RandomizedSet() {
        list  = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val))
        return false;

        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        
        if(list.contains(val)){
            list.remove((Integer) val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {

        Random rand = new Random();
        int index = rand.nextInt(0,list.size());
        return list.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */