????   7 C  %org/eclipse/ui/dialogs/FilteredTree$5  !org/eclipse/swt/events/KeyAdapter this$0 %Lorg/eclipse/ui/dialogs/FilteredTree; <init> ((Lorg/eclipse/ui/dialogs/FilteredTree;)V Code	    
     ()V LineNumberTable LocalVariableTable this 'Lorg/eclipse/ui/dialogs/FilteredTree$5; 
keyPressed $(Lorg/eclipse/swt/events/KeyEvent;)V
    #org/eclipse/ui/dialogs/FilteredTree   	getViewer (()Lorg/eclipse/jface/viewers/TreeViewer;
    $org/eclipse/jface/viewers/TreeViewer    getTree  ()Lorg/eclipse/swt/widgets/Tree;
 " $ # org/eclipse/swt/widgets/Tree % & getItemCount ()I	 ( * ) org/eclipse/swt/events/KeyEvent + , keyCode I  	  / 0 1 
treeViewer &Lorg/eclipse/jface/viewers/TreeViewer;
 " 3 4 5 setFocus ()Z e !Lorg/eclipse/swt/events/K