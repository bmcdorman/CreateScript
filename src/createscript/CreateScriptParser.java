// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/beta/devel/CreateScript/src/createscript/CreateScript.g 2010-04-04 04:17:12

    package createscript;
    import java.util.HashMap;
    import createscript.commands.CreateScriptCommand;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class CreateScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "END", "MM", "CM", "M", "MMS", "CMS", "DS", "MS", "DEG", "S", "RAW", "DIGIT", "LETTER", "WS", "COMMENT", "'='"
    };
    public static final int INTEGER=5;
    public static final int DEG=14;
    public static final int M=9;
    public static final int LETTER=18;
    public static final int T__21=21;
    public static final int DS=12;
    public static final int S=15;
    public static final int EOF=-1;
    public static final int MMS=10;
    public static final int CMS=11;
    public static final int RAW=16;
    public static final int WS=19;
    public static final int MM=7;
    public static final int MS=13;
    public static final int IDENT=4;
    public static final int DIGIT=17;
    public static final int COMMENT=20;
    public static final int END=6;
    public static final int CM=8;

    // delegates
    // delegators


        public CreateScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CreateScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CreateScriptParser.tokenNames; }
    public String getGrammarFileName() { return "/home/beta/devel/CreateScript/src/createscript/CreateScript.g"; }


        public HashMap<String, Unit> variables = new HashMap<String, Unit>();
        public static HashMap<String, Unit> preDefs = new HashMap<String, Unit>();
        public static HashMap<String, CreateScriptCommand> commands = new HashMap<String, CreateScriptCommand>();


    public static class script_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "script"
    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:25:1: script : ( command | variable )* ;
    public final CreateScriptParser.script_return script() throws RecognitionException {
        CreateScriptParser.script_return retval = new CreateScriptParser.script_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CreateScriptParser.command_return command1 = null;

        CreateScriptParser.variable_return variable2 = null;



        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:26:7: ( ( command | variable )* )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:26:13: ( command | variable )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:26:13: ( command | variable )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==21) ) {
                        alt1=2;
                    }
                    else if ( ((LA1_2>=IDENT && LA1_2<=END)) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:26:14: command
            	    {
            	    pushFollow(FOLLOW_command_in_script78);
            	    command1=command();

            	    state._fsp--;

            	    adaptor.addChild(root_0, command1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:26:24: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_script82);
            	    variable2=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variable2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "script"

    public static class command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "command"
    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:29:1: command : IDENT ( IDENT | INTEGER unit )* END ;
    public final CreateScriptParser.command_return command() throws RecognitionException {
        CreateScriptParser.command_return retval = new CreateScriptParser.command_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT3=null;
        Token IDENT4=null;
        Token INTEGER5=null;
        Token END7=null;
        CreateScriptParser.unit_return unit6 = null;


        CommonTree IDENT3_tree=null;
        CommonTree IDENT4_tree=null;
        CommonTree INTEGER5_tree=null;
        CommonTree END7_tree=null;

        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:30:7: ( IDENT ( IDENT | INTEGER unit )* END )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:30:13: IDENT ( IDENT | INTEGER unit )* END
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_command115); 
            IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
            root_0 = (CommonTree)adaptor.becomeRoot(IDENT3_tree, root_0);

            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:30:20: ( IDENT | INTEGER unit )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENT) ) {
                    alt2=1;
                }
                else if ( (LA2_0==INTEGER) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:30:21: IDENT
            	    {
            	    IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_command119); 
            	    IDENT4_tree = (CommonTree)adaptor.create(IDENT4);
            	    adaptor.addChild(root_0, IDENT4_tree);


            	    }
            	    break;
            	case 2 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:30:29: INTEGER unit
            	    {
            	    INTEGER5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_command123); 
            	    INTEGER5_tree = (CommonTree)adaptor.create(INTEGER5);
            	    adaptor.addChild(root_0, INTEGER5_tree);

            	    pushFollow(FOLLOW_unit_in_command125);
            	    unit6=unit();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unit6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            END7=(Token)match(input,END,FOLLOW_END_in_command129); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "command"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:33:1: variable : IDENT '=' i= INTEGER u= unit END ;
    public final CreateScriptParser.variable_return variable() throws RecognitionException {
        CreateScriptParser.variable_return retval = new CreateScriptParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token i=null;
        Token IDENT8=null;
        Token char_literal9=null;
        Token END10=null;
        CreateScriptParser.unit_return u = null;


        CommonTree i_tree=null;
        CommonTree IDENT8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree END10_tree=null;

        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:34:7: ( IDENT '=' i= INTEGER u= unit END )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:34:13: IDENT '=' i= INTEGER u= unit END
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable156); 
            char_literal9=(Token)match(input,21,FOLLOW_21_in_variable159); 
            i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_variable164); 
            pushFollow(FOLLOW_unit_in_variable169);
            u=unit();

            state._fsp--;

            END10=(Token)match(input,END,FOLLOW_END_in_variable172); 

                        variables.put((IDENT8!=null?IDENT8.getText():null), new Unit(Integer.parseInt(i.getText()), u.tree.token.getType()));
                  

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class unit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unit"
    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:40:1: unit : ( MM | CM | M | MMS | CMS | DS | MS | DEG | S | RAW );
    public final CreateScriptParser.unit_return unit() throws RecognitionException {
        CreateScriptParser.unit_return retval = new CreateScriptParser.unit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:41:7: ( MM | CM | M | MMS | CMS | DS | MS | DEG | S | RAW )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=MM && input.LA(1)<=RAW) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unit"

    // Delegated rules


 

    public static final BitSet FOLLOW_command_in_script78 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_variable_in_script82 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_IDENT_in_command115 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_IDENT_in_command119 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_INTEGER_in_command123 = new BitSet(new long[]{0x000000000001FF80L});
    public static final BitSet FOLLOW_unit_in_command125 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_END_in_command129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable156 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_variable159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INTEGER_in_variable164 = new BitSet(new long[]{0x000000000001FF80L});
    public static final BitSet FOLLOW_unit_in_variable169 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_END_in_variable172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unit0 = new BitSet(new long[]{0x0000000000000002L});

}