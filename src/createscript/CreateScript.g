grammar CreateScript;

options {
    language = Java;
    output=AST;
    ASTLabelType=CommonTree;
}

@header {
    package createscript;
    import java.util.HashMap;
    import createscript.commands.CreateScriptCommand;
}

@lexer::header {
    package createscript;
}

@members {
    public HashMap<String, Unit> variables = new HashMap<String, Unit>();
    public static HashMap<String, Unit> preDefs = new HashMap<String, Unit>();
    public static HashMap<String, CreateScriptCommand> commands = new HashMap<String, CreateScriptCommand>();
} 

script 
      :     (command | variable)*
      ;
      
command
      :     IDENT^ (IDENT | INTEGER unit)* END!
      ; 

variable
      :     IDENT! '='! i=INTEGER! u=unit! END!
      {
            variables.put($IDENT.text, new Unit(Integer.parseInt(i.getText()), u.tree.token.getType()));
      }
      ;
      
unit
      :     MM
      |     CM
      |     M
      |     MMS
      |     CMS
      |     DS
      |     MS
      |     DEG
      |     S
      |     RAW
      ;

MM : 'mm' | 'millimeter' ;
CM : 'cm' | 'centimeter';
M : 'm' | 'meter' | 'meters';

MMS : 'mm/s';
CMS : 'cm/s' ;
DS : 'd/s' | 'ds' ;
MS : 'm/s' ;

DEG : 'deg' | 'degree' | 'degrees' ;

S : 's' | 'second' | 'seconds' ;

RAW : 'raw' ;
  

fragment DIGIT : ('0' .. '9') ;
fragment LETTER : ('a' .. 'z' | 'A' .. 'Z') ;

INTEGER : DIGIT+ ;
IDENT : (LETTER | ':' | '_' | '-' | '$' | '!' | ',' | '[' | ']' | '(' | ')')+ ;      

END : ';' ;

WS : (' ' | '\n' | '\r' | '\f' | '\t')+ {$channel=HIDDEN;} ;
COMMENT : '#' .* ('\n'|'\r') {$channel=HIDDEN;} ;