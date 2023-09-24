#include<stdio.h>
#include<stdlib.h>

typedef struct{
    int row,col,data;
}elements;

int main()
{
    int m,n,t,i;
    printf("Enter the number of rows and columns\n");
    scanf("%d %d",&m,&n);
    printf("Enter total number of elements:");
    scanf("%d",&t);
    elements a[t+1],b[t+1];
    a[0].row=b[0].row=m;
    a[0].col=b[0].col=n;
    a[0].data=b[0].data=t;
    printf("enter elements\n");
    printf("Row\tcolumn\tvalue\n");
    for(i=1;i<=t;i++)
    {
        scanf("%d %d %d",&a[i].row,&a[i].col,&a[i].data);
    }
    printf("The matrix is:\n");
    printf("Row\tcolumn\tvalue\n");
    for(i=0;i<=t;i++)
    {
        printf("%d\t%d\t%d\n",a[i].row,a[i].col,a[i].data);
    }
    int total[t],index[t],pos;
    for(i=0;i<t;i++)
    {
        total[i]=index[i]=0;
    }
    for(i=0;i<t;i++)
    {
        total[a[i+1].col]++;
    }
    index[0]=total[0];
    for(i=1;i<t;i++)
    {
        index[i]=index[i-1]+total[i-1];
    }
    for(i=0;i<t;i++)
    {
        pos=index[a[i+1].col]++;
        b[pos].row=a[i+1].col;
        b[pos].col=a[i+1].row;
        b[pos].data=a[i+1].data;
    }
    printf("The transpose of the matrix is:\n");
    printf("Row\tcolumn\tvalue\n");
    for(i=0;i<=t;i++)
    {
        printf("%d\t%d\t%d\n",b[i].row,b[i].col,b[i].data);
    }
    return 0;
}