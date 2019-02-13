%{
#include "y.tab.h"
%}

%%
int|float 	{return DTYPE;}
[a-zA-Z]+		{return ID;}
";"			{return SEMI;}
","			{return COMMA;}
%%

int yywrap(){

return 1;
}													
