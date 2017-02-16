package custom;

import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;

import java.io.File;
import java.util.Collection;

public class LauncherWord2Vec {

  public static void main(String[] args) {
    File gModel = new File("C://Users//Ivan//git//dkpro_example//news_0_300_2.bin.gz");
    Word2Vec vec = WordVectorSerializer.readWord2VecModel(gModel);
    
    Collection<String> lst3 = vec.wordsNearest("человек_NOUN", 10);
    System.out.println(lst3);
  }
  
}
