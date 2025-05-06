#include<stdio.h>
#include<string.h>


int main()
{
	long int i,n,faces=0;
	scanf("%ld",&n);
	char str[n][12];
	for(i=0;i<n;i++)
	{
		scanf("%s",str[i]);
		if(!strcmp("Tetrahedron",str[i])) faces+=4;
		else if(!strcmp("Cube",str[i])) faces+=6;
		else if(!strcmp("Octahedron",str[i])) faces+=8;
		else if(!strcmp("Dodecahedron",str[i])) faces+=12;
		else if(!strcmp("Icosahedron",str[i])) faces+=20;
	}
	printf("%ld",faces);
	return 0;
}