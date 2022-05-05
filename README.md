# 정렬 알고리즘 (202101613 양채은)

버블정렬,선택정렬,삽입정렬, 쉘정렬, 힙정렬, 퀵정렬에 대한 코드를 구현하고 그 코드가 데이터 입력값에 따라 수행되는 시간을 뽑아내고 엑셀에 정리하여 그래프로 나타내는 과정을 진행하였다.      
입력받는 데이터의 개수를 2의 20승까지 늘려볼려고 하였으나, 실행 시간이 너무 오래 걸려서 2의 12승~13승까지밖에 못해봤다.


## 버블정렬

![bubble](https://github.com/akizakic/akizakic.github.io/blob/main/bubbleSort.png?raw=true)

O(n^2)의 형태를 띄고 있으나,    
다른 정렬들과 비교하였을 떄 데이터 값이 늘어감에 따라 유독 오랜 수행시간이 걸림을 볼 수 있다.


## 선택정렬

![select](https://github.com/akizakic/akizakic.github.io/blob/main/selectSort.png?raw=true)

버블 정렬에 비해 두 배 정도 더 빠르게 실행되었다.   
또한, 다른 정렬들에 비해 세 가지 데이터 입력에 대한 차이가 크지가 않았다.

## 삽입정렬

![insertion](https://github.com/akizakic/akizakic.github.io/blob/main/insertionSort.png?raw=true)

정방향(sorted data)에 대한 실행시간은 거의 일정하게 0에 수렴하고 있고 역방향(reversed data)에 대한 시간은 비교적 꽤나 높은 시간을 찍는 것을 보면,
들어오는 데이터 값이 무엇이냐에 따라 실행시간이 많이 달라지는 것을 볼 수 있었다.  

## 쉘 정렬

![shell](https://github.com/akizakic/akizakic.github.io/blob/main/shellSort.png?raw=true)

다른 정렬들에 비해 실행 시간이 유독 빠른 것을 볼 수 있다.

## 힙 정렬

![heap](https://raw.githubusercontent.com/akizakic/akizakic.github.io/385d0733d2a57312b63ba4f8f1fcf145acce4064/heapSort.png)

세가지의 경우 모두 O(nlogn)의 시간복잡도를 잘 따르는 것이 잘 보여진다.

## 퀵 정렬

![quick](https://github.com/akizakic/akizakic.github.io/blob/main/quickSort.png?raw=true)

랜덤 데이터에 대한 값을 보면 0에 가깝지만, 다른 값들은 O(n^2)의 시간 복잡도를 보여주고 있다.
이처럼 퀵 정렬은 일반적으로 O(nlogn)을 따르지만, 최악의 경우 O(n^2)을 따를 수 있다.
