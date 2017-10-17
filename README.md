## This is a project to show the problem when using Yasson with Groovy

### Execute the test by
>./gradlew testclear --info

You will see the GroovyUserSpecification will be failed because of
>EVERE: Generating incomplete JSON  
 java.lang.IllegalArgumentException: wrong number of arguments  
     at org.eclipse.yasson.internal.model.GetFromGetter.internalGetValue(GetFromGetter.java:28)  
     at org.eclipse.yasson.internal.model.GetValueCommand.getValue(GetValueCommand.java:34)  
     at org.eclipse.yasson.internal.model.ReflectionPropagation.getValue(ReflectionPropagation.java:72)  
     at org.eclipse.yasson.internal.model.PropertyModel.getValue(PropertyModel.java:257)  
     at org.eclipse.yasson.internal.serializer.ObjectSerializer.marshallProperty(ObjectSerializer.java:76)  
     at org.eclipse.yasson.internal.serializer.ObjectSerializer.serializeInternal(ObjectSerializer.java:59)  
     at org.eclipse.yasson.internal.serializer.AbstractContainerSerializer.serialize(AbstractContainerSerializer.java:60)  
     at org.eclipse.yasson.internal.serializer.AbstractContainerSerializer.serializerCaptor(AbstractContainerSerializer.java:91)  
     at org.eclipse.yasson.internal.serializer.ObjectSerializer.marshallProperty(ObjectSerializer.java:92)  
     at org.eclipse.yasson.internal.serializer.ObjectSerializer.serializeInternal(ObjectSerializer.java:59)  
     at org.eclipse.yasson.internal.serializer.AbstractContainerSerializer.serialize(AbstractContainerSerializer.java:60)  
     at org.eclipse.yasson.internal.Marshaller.serializeRoot(Marshaller.java:118)  
     at org.eclipse.yasson.internal.Marshaller.marshall(Marshaller.java:76)  
     at org.eclipse.yasson.internal.JsonBinding.toJson(JsonBinding.java:98)  
     at com.pogo.GroovyUserSpecification.Convert To Json(GroovyUserSpecification.groovy:14)  