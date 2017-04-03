In proxy pattern, a class represents surrogate for another class. In the real work a Cheque or Debit card is a proxy for what is in our bank account.
It can be used in place of cash, which is what is needed, and provides a means of accessing that cash when required.
And that's exactly what the Proxy pattern does - controls and manage access to the object they are "protecting".


##Purpose##
Allows for object level access control by acting as a pass through
entity or a placeholder object.

##Use When##
The object being represented is external to the system.
Objects need to be created on demand.
Access control for the original object is required.
Added functionality is required when an object is accessed.


##Possible Usage Scenarios##
*Remote Proxy*
In distributed object communication, a local object represents a remote object (one that belongs to a different address space).
The local object is a proxy for the remote object, and method invocation on the local object results in remote method invocation on the remote object. An example would be an ATM implementation, where the ATM might hold proxy objects for bank information that exists in the remote server.

*Virtual Proxy*
In place of a complex or heavy object, a skeleton representation may be advantageous in some cases. When an underlying image is huge in size, it may be represented using a virtual proxy object, loading the real object on demand.

*Protection Proxy*
A protection proxy might be used to control access to a resource based on access rights.

