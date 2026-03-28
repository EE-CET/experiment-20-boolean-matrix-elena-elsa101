 import java.util.*;
public class BooleanMatrix {

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt(),n=sc.nextInt();
int[][] a=new int[m][n];
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
a[i][j]=sc.nextInt();

for(int i=0;i<m;i++){
boolean hasOne=false;
for(int j=0;j<n;j++){
if(a[i][j]==1){
hasOne=true;
break;
}
}
if(hasOne){
for(int j=0;j<n;j++){
a[i][j]=1;
}
}
}

for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.print(a[i][j]);
if(j<n-1) System.out.print(" ");
}
if(i<m-1) System.out.println();
}
}
}
    

