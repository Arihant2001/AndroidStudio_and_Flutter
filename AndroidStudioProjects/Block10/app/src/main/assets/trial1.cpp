#include<iostream>
using namespace std;

long long Period(long long m){
    int previous=0;
	int current = 1;
	int i;
    for(i=0;i<(m*m);i++){
        previous = current;
		current = (previous + current) % m ;
        if (previous == 0 && current == 1){
        	return i + 1;
    	}
    }
}
  
long long fibonacciModulo(long long n,long long m){
	int period = Period(m) ;
    int i;
    n = n % period ;  
    int previous=0;
	int current =1;
    if(n==0 ){
        return 0;
    }
    else if(n==1){
        return 1;
	}
    for(i=3;i<(n-1);i++){
        previous = current; 
        current = (previous + current);
		current=current%m; 
        
    }
    return current;
}

int main(){
    long long n,m;
    cin>>n;
    cin>>m;
    cout<<fibonacciModulo(n, m);
}
