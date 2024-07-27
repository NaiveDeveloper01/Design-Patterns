Strategy design pattern
// in this design pattern we separate algorithms from the
actual code
Principles we use to implement the code is as given
    1.Encapsulate what varies -> by this you can make changes without impacting client code.
    2.Prefer composition to inheritance -> Inheritance violates the encapsulation.
    3.Code to interface -> You can adapt the changes as run time.
    4. Only thing constant is CHANGE

In strategy pattern we separate algorithms from existing code, For example if we have a code that
handles the delivery that is transportation, and we have 3 mode of transportation 1. By road, 2. By Ship
3.By Plane.

we do have different algorithms implemented for each transportation mode and rest of the logic is same
transportation mode will vary on run time.
And Algorithms for each mode of transportation will also vary depending on the business requirement for example
we can change ship type and plane type as we need, and it won't impact the main application.


More about the principles
1. Encapsulate what varies -> It means that there can be situations where the methods, parameters to methods can be changed
by the business logic or by any other means.
To incorporate these changes we should make very less change in existing code. To achieve this, we encapsulate these changes
into a class, and then we might alter this changes as per business logic.

eg
initial method:
public void processOrder(int amount, int quantity, string delivery)
{
    // this part will process the delivery and make payment and all
}

if sudden requirement changes, and they want to pass type of delivery as it's a COD or Paid to the processOrder method
then as a result we can break the application if we change the param number in method


To keep application flexible, we should always think about the change that might come into the project.

so we encapsulate what is changing that is OrderParams

Code snippet:
final code
interface order
{
    processOrder();
}

OrderParams implements order
{
    int amount, int quantity, string delivery, String typeOfDelivery

    public void processOrder()
    {
       // logic to process the order here
    }
}


public void processOrder(Order order)
{
    // this will tackle the changes
    order.processOrder();
}


2. Prefer composition to inheritance: we should analyze what can be composite into class using the hasA and isA
relation and according to that we should design the classes.
As we know where to use what then we can easily


3. Code to interface->Code to interface means we should hold the objects into the reference of an interface.
and then whenever we required pass that object to method we can accept it as reference variables in method
by that we can say that we can adapt whatever object that can be passed.

4. CHANGE is constant -> we should think as what can change and what can't. As there is entire application can be change but
we should analyze what are most likely changes can happen and should adapt accordingly.






