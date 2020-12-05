/**
   Arvioitava rajapinta
*/
public interface Arvioitava
{
   boolean equals(TenttiArvostelu t);
   boolean onSuurempiKuin(TenttiArvostelu t);
   boolean onPienempiKuin(TenttiArvostelu t);
}