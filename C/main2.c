#include <stdio.h>
int add(int a, int b){
	int c;
	printf("Enter a number:");
	scanf("%d", &a);
	printf("Enter a number:");
	scanf("%d", &b);
	c = a + b;
	printf("%d\n",c);
}
int sub(int a,int b){
	int c;
	printf("Enter a number:");
	scanf("%d", &a);
	printf("Enter a number:");
	scanf("%d", &b);
	c = a - b;
	printf("%d\n",c);
}
int mul(int a, int b){
	int c;
	printf("Enter a number:");
	scanf("%d", &a);
	printf("Enter a number:");
	scanf("%d", &b);
	c = a * b;
	printf("%d\n",c);
}
int div(int a, int b){
	int c;
	printf("Enter a number:");
	scanf("%d", &a);
	printf("Enter a number:");
	scanf("%d", &b);
	c = a / b;
	printf("%d\n",c);
}



void main(){
	int r = 3;
	int a,b;
	switch(r){
		case 1:
			add(a,b);
			break;
		case 2:
			sub(a,b);
			break;
		case 3:
			mul(a,b);
			break;
		case 4:
			div(a,b);
			break;
		default:
			printf("Default value");
		}
}
