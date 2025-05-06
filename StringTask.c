#include<stdio.h>
#include<ctype.h>
#include<string.h>

int main()
{
	char str[201];
	int i=0,j;
	scanf("%101s",str);
	while(str[i])
	{
		str[i]=tolower(str[i]);
		if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='y')
		{
			for(j=i;str[j];j++)
			{
				str[j]=str[j+1];
			}
            // i remains the same to check the new character
		}
		else
		{
			for(j=strlen(str)+1; j>i ; j--)
			{
				str[j]=str[j-1];
			}
			str[i]='.';
			i=i+2;  // Skip the dot and the consonant
		}
	}
	printf(str);
	return 0;
}
/*
This can be by following code also.

#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main() {
    char str[101];
    char result[201] = {0};  // Worst case: each char becomes ".x" (double size + null)
    int i, j = 0;

    scanf("%100s", str);

    for (i = 0; str[i]; i++) {
        str[i] = tolower(str[i]);
        if (str[i] == 'a'||str[i] == 'e'||str[i] == 'i'||str[i] == 'o'||str[i] == 'u'||str[i] == 'y'){
			continue; // Skip vowels 
        }
	// Even if I don't write previous line there is no problem because continue skips and and don't writing also skips 
		else {
            result[j++] = '.';  // Add dot before consonant
            result[j++] = str[i];  // Add the consonant
        }
    }
    result[j] = '\0';  // Null-terminate the result

    printf("%s\n", result);
    return 0;
}
*/