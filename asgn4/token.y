%{
	#include "y.tab.h"
	#include "stdio.h"
%}
%token DTYPE ID SEMI COMMA
%%
Decl:DTYPE IDlist  SEMI 		{printf("valid\n");}
IDlist : ID  COMMA IDlist | ID  {printf("intermediate\n");}
%%

void main(){

	extern FILE *yyin;
	yyin = fopen("test.txt","r");
	yyparse();
}

int yyerror(char *s){
	printf("error =%s\n", s);
	return 1;
}
