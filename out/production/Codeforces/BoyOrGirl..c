// Number of distinct letters in a name
#include<stdio.h>

int main()
{
	int i,letter[26],distinct_letter=0;
	for(i=0;i<26;i++) letter[i]=0;
	char name[101];
	scanf("%s",name);
	i=0;
	while(name[i])
	{
		if(name[i]=='a') letter[0]++;
		if(name[i]=='b') letter[1]++;
		if(name[i]=='c') letter[2]++;
		if(name[i]=='d') letter[3]++;
		if(name[i]=='e') letter[4]++;
		if(name[i]=='f') letter[5]++;
		if(name[i]=='g') letter[6]++;
		if(name[i]=='h') letter[7]++;
		if(name[i]=='i') letter[8]++;
		if(name[i]=='j') letter[9]++;
		if(name[i]=='k') letter[10]++;
		if(name[i]=='l') letter[11]++;
		if(name[i]=='m') letter[12]++;
		if(name[i]=='n') letter[13]++;
		if(name[i]=='o') letter[14]++;
		if(name[i]=='p') letter[15]++;
		if(name[i]=='q') letter[16]++;
		if(name[i]=='r') letter[17]++;
		if(name[i]=='s') letter[18]++;
		if(name[i]=='t') letter[19]++;
		if(name[i]=='u') letter[20]++;
		if(name[i]=='v') letter[21]++;
		if(name[i]=='w') letter[22]++;
		if(name[i]=='x') letter[23]++;
		if(name[i]=='y') letter[24]++;
		if(name[i]=='z') letter[25]++;
		i++;
	}
	for(i=0;i<26;i++)
	{
		if(letter[i]>0) distinct_letter++;
	}
	if(distinct_letter%2==0) printf("CHAT WITH HER!");
	else printf("IGNORE HIM!");
	return 0;
}