void main(){
    int arr[] = {5,0,0,23,5,0,35};

    int index = 0;

    for(int i = 0; i< arr.length;i++){
        if(arr[i] != 0){
            arr[index] = arr[i];
            index++;
        }
    }
    while (index < arr.length){
        arr[index] = 0;
        index++;
    }
    IO.println(Arrays.toString(arr));
}
