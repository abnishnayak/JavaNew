????   < H  loops/Summation  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lloops/Summation; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   $Enter a number to find the summation
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . Summation of the number = 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder;
 + 6 7 8 toString ()Ljava/lang/String;
  : ;  close args [Ljava/lang/String; s Ljava/util/Scanner; n I sum i StackMapTable = 
SourceFile Summation.java !               /     *? ?    
                    	       ?     I? Y? ? L? ? !+? '=>6? `>????? ? +Y-? /? 1? 5? !+? 9?    
   * 
     	  
        %  .  D  H   