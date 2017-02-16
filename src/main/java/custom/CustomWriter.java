package custom;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasConsumer_ImplBase;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;

public class CustomWriter extends JCasConsumer_ImplBase {

  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {

    /* all sentences */
    for (Sentence sentence : JCasUtil.select(aJCas, Sentence.class)) {

      System.out.println(sentence);

    } /* for each sentence */
    
    for (Token token : JCasUtil.select(aJCas, Token.class)) {

      System.out.println(token);

    } 
    
  } /* process() */
} /* class */
