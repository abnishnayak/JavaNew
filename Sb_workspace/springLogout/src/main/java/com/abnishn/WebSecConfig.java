ocumentColorProvider.java:60)
	at org.eclipse.lsp4e.operations.color.DocumentColorProvider.provideCodeMinings(DocumentColorProvider.java:88)
	at org.eclipse.jface.internal.text.codemining.CodeMiningManager.lambda$2(CodeMiningManager.java:189)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
	at org.eclipse.jface.internal.text.codemining.CodeMiningManager.getCodeMinings(CodeMiningManager.java:195)
	at org.eclipse.jface.internal.text.codemining.CodeMiningManager.updateCodeMinings(CodeMiningManager.java:140)
	at org.eclipse.jface.internal.text.codemining.CodeMiningManager.run(CodeMiningManager.java:129)
	at org.eclipse.jface.text.source.SourceViewer.updateCodeMinings(SourceViewer.java:1313)
	at org.eclipse.jface.text.source.SourceViewer.e