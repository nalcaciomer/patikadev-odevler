# Selection Sort

## Soru 1

- **[22, 27, 16, 2, 18, 6]**

1. Yukarıda verilen dizinin **Selection Sort** türüne göre aşamalarını yazınız.
2. Big-O gösterimini yazınız.
3. Time Complexity: Average case: Aradığımız sayının ortada olması, Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

### 1. Sıralama Aşamaları

1. **[2, 27, 16, 22, 18, 6]**
2. **[2, 6, 16, 22, 18, 27]**
3. **[2, 6, 16, 18, 22, 27]**

### 2. Big-O Notation:

Big-O Notation = **O(n^2^)**

### 3. Time Complexity: 

- Best Case: **O(n^2^)**
- Avarage Case: **O(n^2^)**
- Worst Case: **O(n^2^)**

### 4.

18 sayısı sıralandıktan sonra **Avarage Case** durumundadır.

---
## Soru 2

- **[7, 3, 5, 8, 2, 9, 4, 15, 6]** 

Yukarıda verilen dizinin **Selection Sort**' a göre ilk 4 adımını yazınız.

1. **[2, 3, 5, 8, 7, 9, 4, 15, 6]**
2. **[2, 3, 5, 8, 7, 9, 4, 15, 6]**
3. **[2, 3, 4, 8, 7, 9, 5, 15, 6]**
4. **[2, 3, 4, 5, 7, 9, 8, 15, 6]**
5. **[2, 3, 4, 5, 6, 9, 8, 15, 7]**
6. **[2, 3, 4, 5, 6, 7, 8, 15, 9]**
7. **[2, 3, 4, 5, 6, 7, 8, 9, 15]**