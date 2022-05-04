# 정렬 알고리즘 (202101613 양채은)

입력받는 데이터의 개수를 2의 20승까지 늘려볼려고 하였으나, 실행 시간이 너무 오래 걸려서 2의 12승~13승까지밖에 못해봤습니다.


## 버블정렬

![bubble](https://github.com/akizakic/akizakic.github.io/blob/main/bubbleSort.png?raw=true)

O(n^2)의 형태를 띄고 있으나,    
다른 정렬들과 비교하였을 떄 가장 오랜 실행시간이 걸림을 볼 수 있었다.


## 선택정렬

![select](https://github.com/akizakic/akizakic.github.io/blob/main/selectSort.png?raw=true)

버블 정렬에 비해 두 배 정도 더 빠르게 실행되었다.   
또한, 다른 정렬들에 비해 세 가지 데이터 입력에 대한 차이가 크지가 않았다.

## 삽입정렬

![insertion](https://github.com/akizakic/akizakic.github.io/blob/main/insertionSort.png?raw=true)

정방향(sorted data)에 대한 값은 거의 일정하게 0에 수렴하고 있고 역방향(reversed data)에 대한 값은 최고조를 찍는 것을 보면,
들어오는 데이터 값이 무엇이냐에 따라 실행시간이 많이 달라지는 것을 볼 수 있었다.  

## 쉘 정렬

![shell](https://github.com/akizakic/akizakic.github.io/blob/main/shellSort.png?raw=true)

## 퀵 정렬

![quick](https://github.com/akizakic/akizakic.github.io/blob/main/quickSort.png?raw=true)
