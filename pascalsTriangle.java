class Solution {
    private List<List<Integer>> pascalsTriangle;
    public List<List<Integer>> generate(int numRows) {
	pascalsTriangle = new ArrayList<>(numRows);
	for(int i=0; i<numRows; i++){
	    pascalsTriangle.add(generateRow(i));
	}
	return pascalsTriangle;
    }

    private List<Integer> generateRow(int rowNum){
	List<Integer> toReturn = new ArrayList<>(rowNum);
	toReturn.add(1);
	if(rowNum == 0){
	    return toReturn;
	}
	List<Integer> prevRow = pascalsTriangle.get(rowNum-1);
	for(int i=1; i<rowNum; i++){
	    toReturn.add(prevRow.get(i-1) + prevRow.get(i));
	}
	toReturn.add(1);
	return toReturn;
    }
}
/*
 * 3
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 *
 *
 *
 *
 *
 *
 */
