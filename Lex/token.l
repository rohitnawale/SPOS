%{


%}


%%
#.*>		{printf("%s:Header\n", yytext);}
int|float	{printf("%s:Data type\n", yytext);}
[a-z]+.*\) 	{printf("%s:function", yytext);}
(printf)        {printf("%s:Output",yytext);}
[a-z]		{printf("%s:literals",yytext);}	

%%


void main(){
	yyin = fopen("input.c", "r");
	yylex();



}

int yywrap(){

return 1;
}
