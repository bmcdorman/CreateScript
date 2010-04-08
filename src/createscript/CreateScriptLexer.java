// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/beta/devel/CreateScript/src/createscript/CreateScript.g 2010-04-04 04:17:13

    package createscript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CreateScriptLexer extends Lexer {
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
    public static final int END=6;
    public static final int COMMENT=20;
    public static final int CM=8;

    // delegates
    // delegators

    public CreateScriptLexer() {;} 
    public CreateScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreateScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/beta/devel/CreateScript/src/createscript/CreateScript.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:11:7: ( '=' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "MM"
    public final void mMM() throws RecognitionException {
        try {
            int _type = MM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:53:4: ( 'mm' | 'millimeter' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='m') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='m') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='i') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:53:6: 'mm'
                    {
                    match("mm"); 


                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:53:13: 'millimeter'
                    {
                    match("millimeter"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MM"

    // $ANTLR start "CM"
    public final void mCM() throws RecognitionException {
        try {
            int _type = CM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:54:4: ( 'cm' | 'centimeter' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='c') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='m') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='e') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:54:6: 'cm'
                    {
                    match("cm"); 


                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:54:13: 'centimeter'
                    {
                    match("centimeter"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CM"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            int _type = M;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:55:3: ( 'm' | 'meter' | 'meters' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='m') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='e') ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2=='t') ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4=='e') ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5=='r') ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6=='s') ) {
                                    alt3=3;
                                }
                                else {
                                    alt3=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    alt3=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:55:5: 'm'
                    {
                    match('m'); 

                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:55:11: 'meter'
                    {
                    match("meter"); 


                    }
                    break;
                case 3 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:55:21: 'meters'
                    {
                    match("meters"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "MMS"
    public final void mMMS() throws RecognitionException {
        try {
            int _type = MMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:57:5: ( 'mm/s' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:57:7: 'mm/s'
            {
            match("mm/s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MMS"

    // $ANTLR start "CMS"
    public final void mCMS() throws RecognitionException {
        try {
            int _type = CMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:58:5: ( 'cm/s' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:58:7: 'cm/s'
            {
            match("cm/s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CMS"

    // $ANTLR start "DS"
    public final void mDS() throws RecognitionException {
        try {
            int _type = DS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:59:4: ( 'd/s' | 'ds' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='d') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='/') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='s') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:59:6: 'd/s'
                    {
                    match("d/s"); 


                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:59:14: 'ds'
                    {
                    match("ds"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DS"

    // $ANTLR start "MS"
    public final void mMS() throws RecognitionException {
        try {
            int _type = MS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:60:4: ( 'm/s' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:60:6: 'm/s'
            {
            match("m/s"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MS"

    // $ANTLR start "DEG"
    public final void mDEG() throws RecognitionException {
        try {
            int _type = DEG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:62:5: ( 'deg' | 'degree' | 'degrees' )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:62:7: 'deg'
                    {
                    match("deg"); 


                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:62:15: 'degree'
                    {
                    match("degree"); 


                    }
                    break;
                case 3 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:62:26: 'degrees'
                    {
                    match("degrees"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEG"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            int _type = S;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:64:3: ( 's' | 'second' | 'seconds' )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:64:5: 's'
                    {
                    match('s'); 

                    }
                    break;
                case 2 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:64:11: 'second'
                    {
                    match("second"); 


                    }
                    break;
                case 3 :
                    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:64:22: 'seconds'
                    {
                    match("seconds"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "RAW"
    public final void mRAW() throws RecognitionException {
        try {
            int _type = RAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:66:5: ( 'raw' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:66:7: 'raw'
            {
            match("raw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAW"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:69:16: ( ( '0' .. '9' ) )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:69:18: ( '0' .. '9' )
            {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:69:18: ( '0' .. '9' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:69:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:70:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:70:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:72:9: ( ( DIGIT )+ )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:72:11: ( DIGIT )+
            {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:72:11: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:72:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:73:7: ( ( LETTER | ':' | '_' | '-' | '$' | '!' | ',' | '[' | ']' | '(' | ')' )+ )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:73:9: ( LETTER | ':' | '_' | '-' | '$' | '!' | ',' | '[' | ']' | '(' | ')' )+
            {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:73:9: ( LETTER | ':' | '_' | '-' | '$' | '!' | ',' | '[' | ']' | '(' | ')' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='!'||LA8_0=='$'||(LA8_0>='(' && LA8_0<=')')||(LA8_0>=',' && LA8_0<='-')||LA8_0==':'||(LA8_0>='A' && LA8_0<='[')||LA8_0==']'||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:
            	    {
            	    if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>=',' && input.LA(1)<='-')||input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:75:5: ( ';' )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:75:7: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:77:4: ( ( ' ' | '\\n' | '\\r' | '\\f' | '\\t' )+ )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:77:6: ( ' ' | '\\n' | '\\r' | '\\f' | '\\t' )+
            {
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:77:6: ( ' ' | '\\n' | '\\r' | '\\f' | '\\t' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||(LA9_0>='\f' && LA9_0<='\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:78:9: ( '#' ( . )* ( '\\n' | '\\r' ) )
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:78:11: '#' ( . )* ( '\\n' | '\\r' )
            {
            match('#'); 
            // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:78:15: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:78:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:8: ( T__21 | MM | CM | M | MMS | CMS | DS | MS | DEG | S | RAW | INTEGER | IDENT | END | WS | COMMENT )
        int alt11=16;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:16: MM
                {
                mMM(); 

                }
                break;
            case 3 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:19: CM
                {
                mCM(); 

                }
                break;
            case 4 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:22: M
                {
                mM(); 

                }
                break;
            case 5 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:24: MMS
                {
                mMMS(); 

                }
                break;
            case 6 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:28: CMS
                {
                mCMS(); 

                }
                break;
            case 7 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:32: DS
                {
                mDS(); 

                }
                break;
            case 8 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:35: MS
                {
                mMS(); 

                }
                break;
            case 9 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:38: DEG
                {
                mDEG(); 

                }
                break;
            case 10 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:42: S
                {
                mS(); 

                }
                break;
            case 11 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:44: RAW
                {
                mRAW(); 

                }
                break;
            case 12 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:48: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 13 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:56: IDENT
                {
                mIDENT(); 

                }
                break;
            case 14 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:62: END
                {
                mEND(); 

                }
                break;
            case 15 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:66: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // /home/beta/devel/CreateScript/src/createscript/CreateScript.g:1:69: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA5_eotS =
        "\3\uffff\1\5\3\uffff\1\11\2\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\1\144\1\145\1\147\1\162\1\145\1\uffff\1\145\1\163\2\uffff";
    static final String DFA5_maxS =
        "\1\144\1\145\1\147\1\162\1\145\1\uffff\1\145\1\163\2\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "62:1: DEG : ( 'deg' | 'degree' | 'degrees' );";
        }
    }
    static final String DFA6_eotS =
        "\1\uffff\1\3\5\uffff\1\11\2\uffff";
    static final String DFA6_eofS =
        "\12\uffff";
    static final String DFA6_minS =
        "\1\163\1\145\1\143\1\uffff\1\157\1\156\1\144\1\163\2\uffff";
    static final String DFA6_maxS =
        "\1\163\1\145\1\143\1\uffff\1\157\1\156\1\144\1\163\2\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\4\uffff\1\3\1\2";
    static final String DFA6_specialS =
        "\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "64:1: S : ( 's' | 'second' | 'seconds' );";
        }
    }
    static final String DFA11_eotS =
        "\2\uffff\1\20\2\10\1\27\1\10\5\uffff\1\32\2\10\2\uffff\1\36\1\10"+
        "\1\uffff\1\23\2\10\1\uffff\1\10\2\uffff\2\10\2\uffff\1\10\1\47\1"+
        "\10\1\51\4\10\1\uffff\1\10\1\uffff\1\10\1\20\4\10\1\20\1\10\1\47"+
        "\1\27\2\10\1\47\1\27\4\10\1\32\1\36";
    static final String DFA11_eofS =
        "\76\uffff";
    static final String DFA11_minS =
        "\1\11\1\uffff\1\41\1\145\1\57\1\41\1\141\5\uffff\1\41\1\154\1\164"+
        "\2\uffff\1\41\1\156\1\uffff\1\41\1\147\1\143\1\uffff\1\167\2\uffff"+
        "\1\154\1\145\2\uffff\1\164\1\41\1\157\1\41\1\151\1\162\1\151\1\145"+
        "\1\uffff\1\156\1\uffff\1\155\1\41\1\155\1\145\1\144\1\145\1\41\1"+
        "\145\2\41\2\164\2\41\2\145\2\162\2\41";
    static final String DFA11_maxS =
        "\1\172\1\uffff\1\172\1\155\1\163\1\172\1\141\5\uffff\1\172\1\154"+
        "\1\164\2\uffff\1\172\1\156\1\uffff\1\172\1\147\1\143\1\uffff\1\167"+
        "\2\uffff\1\154\1\145\2\uffff\1\164\1\172\1\157\1\172\1\151\1\162"+
        "\1\151\1\145\1\uffff\1\156\1\uffff\1\155\1\172\1\155\1\145\1\144"+
        "\1\145\1\172\1\145\2\172\2\164\2\172\2\145\2\162\2\172";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\5\uffff\1\14\1\15\1\16\1\17\1\20\3\uffff\1\10\1\4\2"+
        "\uffff\1\7\3\uffff\1\12\1\uffff\1\5\1\2\2\uffff\1\6\1\3\10\uffff"+
        "\1\11\1\uffff\1\13\24\uffff";
    static final String DFA11_specialS =
        "\76\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\12\1\uffff\2\12\22\uffff\1\12\1\10\1\uffff\1\13\1\10\3\uffff"+
            "\2\10\2\uffff\2\10\2\uffff\12\7\1\10\1\11\1\uffff\1\1\3\uffff"+
            "\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\3\1\4\10\10"+
            "\1\2\4\10\1\6\1\5\7\10",
            "",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\1\uffff\1\17\12"+
            "\uffff\1\10\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\4\10\1\16\3\10\1\15\3\10\1\14\15\10",
            "\1\22\7\uffff\1\21",
            "\1\23\65\uffff\1\25\15\uffff\1\24",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\4\10\1\26\25"+
            "\10",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\1\uffff\1\31\12"+
            "\uffff\1\10\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\32\10",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\1\uffff\1\35\12"+
            "\uffff\1\10\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\32\10",
            "\1\37",
            "",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\40",
            "\1\41",
            "",
            "\1\42",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\45",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\21\10\1\46"+
            "\10\10",
            "\1\50",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "\1\56",
            "",
            "\1\57",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\22\10\1\60"+
            "\7\10",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\65",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\22\10\1\66"+
            "\7\10",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\22\10\1\67"+
            "\7\10",
            "\1\70",
            "\1\71",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10",
            "\1\10\2\uffff\1\10\3\uffff\2\10\2\uffff\2\10\14\uffff\1\10"+
            "\6\uffff\33\10\1\uffff\1\10\1\uffff\1\10\1\uffff\32\10"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | MM | CM | M | MMS | CMS | DS | MS | DEG | S | RAW | INTEGER | IDENT | END | WS | COMMENT );";
        }
    }
 

}