package DifferenceBetweenSerializationAndExternalization;

public class Difference {

    /*
      The main Difference between Serialization and Externalization is :-

      1) Serialization is a Marker or Tagged interface and Externalization is not a Marker or Tagged interface it has two method
         writeExternal(OutputStream outputStream)   and readExternal(InputSTream inputStream)

      2) Serailization is bydefault serialize complete data till we do not provide transient or static keyword
         in deserialization the data we want to serialize we can write it in writeExternal() and the data we want to deserialize we ahev to write it
         into readExternal()

      3) Serializable interface does not extends any other interface but Externalizable interface extends Serializable interface


     */
}
