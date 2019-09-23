#include <stdio.h>
int naturalNumbers(int n){
	printf("Enter a natural number:");
	scanf("%d", &n);
	int a = 1;
	printf("n = %d\n",n);
	while (a <= n){
		
		printf("%d\n",a);
		a = a + 1;
	}
}

int reverseNaturalNumbers(int n){
	printf("Enter a natural number:");
	scanf("%d", &n);
	int a = 1;
	printf("n = %d\n",n);
	while (a <= n){
		
		printf("%d\n",n);
		n = n - 1;
	}
}

char alphabet(char k){
	 k = 'a' ;
	while( k <= 'z'){
		printf("%c\n",k);
		k = k + 1;
	}
}
int even(int n){
	n = 1;
	while(n <= 100){
		if(n % 2 == 0){
			printf("%d\n",n);
			n = n + 1;
		}else{}
		n = n + 1;
	}
}

int odd(int n){
	n = 1;
	while(n <= 100){
		if(n % 2 != 0){
			printf("%d\n",n);
			n = n + 1;
		}else{}
		n = n + 1;
	}
}

int sumOfNaturalNumbers(int n){
	printf("Enter a natural number:");
	scanf("%d", &n);
	printf("0");
	int a = 1;
	int sum = 0;
	while (a <= n){
		printf("+%d",a);
		sum = sum + a;
		a = a + 1;
	}
	printf("=%d\n",sum);	
}

int sumOfEvenNumbers(int n){
	int a = 1;
	int sum = 0;
	printf("Enter a  number:");
	scanf("%d", &n);
	printf("0");
	printf("n = %d\n",n);
	while(a <= n){
		if(a % 2 == 0){
			printf("+%d",a);
			sum = sum + a;
			a = a + 1;
		}else{}
		a = a + 1;
	}
	printf("=%d\n",sum);	
}

int sumOfOddNumbers(int n){
	int a = 1;
	int sum = 0;
	printf("Enter a  number:");
	scanf("%d", &n);
	printf("0");
	printf("n = %d\n",n);
	while(a <= n){
		if(a % 2 != 0){
			printf("+%d",a);
			sum = sum + a;
			a = a + 1;
		}else{}
		a = a + 1;
	}
	printf("=%d\n",sum);	
}

int multiplicationTable(int n){
	printf("Enter a  number:");
	scanf("%d", &n);
	int a = 1;
	printf("n = %d\n",n);
	while(a <= 12){
 		int d;
		d = n * a;
		printf("%dx%d=%d\n", n,a,d);
		a = a + 1;
	}
}

int countNumberOfDigits(int n){
	printf("Enter a number :");
	scanf("%d", &n);
	int count = 0;
	while(n != 0){
		n = n / 10;
		count = count + 1;
	}
	printf("%d\n", count);
}
int findFirstAndLastDigitNumber(int n){
	printf("Enter a number :");
	scanf("%d", &n);
	int count = 0;
	int m = n;
	while(n != 0){
		n = n / 10;
		m = m % 10;
		count = count + 1;
		if(count == 0 ){
			printf("First Digit:%d\n", n);
		}else{}
	}
	
	
	printf("The last digit :%d\n", m);
	
}


int findSumofFirstAndLastDigitNumber(int n){
	printf("Enter a number :");
	scanf("%d", &n);
	int count = 0;
	int k,l;
	int m = n;
	while(n != 0){
		n = n / 10;
		m = m % 10;
		count = count + 1;
		if(count == 3){
			printf("First Digit:%d\n", n);
			int l = n;
			//printf("%d\n", l);
			
		}else{}
	}
	
	printf("The last digit :%d\n", m);
	
	printf("Sum of the first and last digits :%d\n",k);
	
}




void main(){
	int a = 12;
	int n;
	char k;
	switch(a){
		case 1:
			naturalNumbers(n);
			break;
		case 2:
			reverseNaturalNumbers(n);
			break;
		case 3:
			alphabet(k);
			break;
		case 4:
			even(n);
			break;
		case 5:
			odd(n);
			break;
		case 6:
			sumOfNaturalNumbers(n);
			break;
		case 7:
			sumOfEvenNumbers(n);
			break;
		case 8:
			sumOfOddNumbers(n);
			break;
		case 9:
			multiplicationTable(n);
			break;
		case 10:
			countNumberOfDigits(n);
			break;
		case 11:
			findFirstAndLastDigitNumber(n);
			break;
		case 12:
			findSumofFirstAndLastDigitNumber(n);
			break;
		
		default:
			printf("Default value");
	}
}
