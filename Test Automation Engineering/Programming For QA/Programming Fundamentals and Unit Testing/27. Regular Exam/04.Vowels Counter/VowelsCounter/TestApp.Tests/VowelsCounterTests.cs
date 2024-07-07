using System;
using System.Text;
using System.Linq;
using NUnit.Framework;
using System.Collections.Generic;

namespace TestApp.Tests
{
    public class VowelsCounterTests
    {
        [Test]
        public void Test_CountTotalVowels_GetEmptyList_ReturnsZero()
        {
            // Arrange
            List<string> words = new List<string>();

            // Act 
            int result = VowelsCounter.CountTotalVowels(words);

            // Assert
            Assert.AreEqual(0, result);
        }

        [Test]
        public void Test_CountTotalVowels_GetListWithEmptyStringValues_ReturnsZero()
        {
            // Arrange
            List<string> words = new List<string> { "", "", "" };

            // Act
            int result = VowelsCounter.CountTotalVowels(words);

            // Assert
            Assert.AreEqual(0, result);
        }

        [Test]
        public void Test_CountTotalVowels_MultipleLowerCaseStrings_ReturnsVowelsCount()
        {
            // Arrange
            List<string> words = new List<string> { "hello", "world", "test" };

            // Act
            int result = VowelsCounter.CountTotalVowels(words);

            // Assert
            Assert.AreEqual(4, result);
        }

        [Test]
        public void Test_CountTotalVowels_GetStringsWithNoVowels_ReturnsZero()
        {
            // Arrange
            List<string> words = new List<string> { "bcdfg", "hjklm" };

            // Act
            int result = VowelsCounter.CountTotalVowels(words);

            // Assert
            Assert.AreEqual(0, result);
        }

        [Test]
        public void Test_CountTotalVowels_StringsWithMixedCaseVowels_ReturnsVowelsCount()
        {
            // Arrange
            List<string> words = new List<string> { "Hello", "World", "AEIOU", "aeiou" };

            // Act
            int result = VowelsCounter.CountTotalVowels(words);

            // Assert
            Assert.AreEqual(13, result);
        }
    }
}

