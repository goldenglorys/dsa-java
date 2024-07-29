public class Array {
    private int[] numbers;
    private int count;

    public Array(int size){
        numbers = new int[size];
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public void insert(int value){
        if(count == numbers.length){
            int[] newNumbers = new int[numbers.length * 2];
            for(int i = 0; i < numbers.length; i++){
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
      numbers[count++] = value;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++){
            numbers[i] = numbers[i + 1];
            count--;
        }
    }

    public int indexOf(int value){
        for(int i = 0; i < count; i++){
            if(numbers[i] == value){
                return i;
            }
        }
        return -1;
    }
}
