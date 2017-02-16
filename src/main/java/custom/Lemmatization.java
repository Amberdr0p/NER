package custom;

import ru.stachek66.nlp.mystem.holding.Factory;
import ru.stachek66.nlp.mystem.holding.MyStem;
import ru.stachek66.nlp.mystem.holding.MyStemApplicationException;
import ru.stachek66.nlp.mystem.holding.Request;
import ru.stachek66.nlp.mystem.model.Info;
import scala.Option;
import scala.collection.JavaConversions;

import java.io.File;

public class Lemmatization {


  private final static MyStem mystemAnalyzer = new Factory("-ld --format json")
      .newMyStem("3.0", Option.<File>empty()).get();

  public static void main(final String[] args) throws MyStemApplicationException {

    String s = new String("языки жу");
    final Iterable<Info> result = JavaConversions.asJavaIterable(
        mystemAnalyzer.analyze(Request.apply(s)).info().toIterable());

    System.out.println(s);
    
    for (final Info info : result) {
      System.out.println(info.initial().toString() + " -> " + info.lex() + " | " + info.rawResponse());
    }
  }

}
