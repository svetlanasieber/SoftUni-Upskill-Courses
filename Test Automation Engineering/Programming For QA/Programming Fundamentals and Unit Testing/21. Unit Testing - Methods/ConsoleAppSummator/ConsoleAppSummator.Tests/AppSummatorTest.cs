namespace ConsoleAppSummator.Tests
{
    public class AppSummatorTest
    {

        /*   [SetUp]
         public void Setup()
           {
               ;
           }

           [TearDown]

           publi void TearDown()
           {
               ;
           }
           [Test]
           public void ProgramSumShouldReturnSummedNumbers()
           {
              int sumOfArray = Program.Sum(new int[] { 1, 2, 3 });

               Assert.That(sumOfArray == 6);
           }


           public void ProgramSumShouldReturn0IfNothingIsPassed() 
           {

               int sumOfArray = Program.Sum(new int[0]);

               Assert.That(sumOfArray == 0);
           }
       */


        public void ProgramSumShouldReturnSummedNumbers()
        {


            //Arrange
            int[] arrayOfNums = new int[] { 1, 2, 3 };

            //Act
            int sumOfArray = Program.Sum(arrayOfNums);

            //Assert
            Assert.That(sumOfArray == 6);
        }
    }
}