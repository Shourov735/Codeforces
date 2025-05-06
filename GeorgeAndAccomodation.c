#include<stdio.h>

int main()
{
	int i,n,room=0;
	scanf("%d",&n);
	int people[n],capacity[n]; 
	for(i=0;i<n;i++)
	{
		scanf("%d %d",&people[i], &capacity[i]);
		if(people[i]<(capacity[i]-1)) room++;
	}
	printf("%d",room);
	return 0;
}