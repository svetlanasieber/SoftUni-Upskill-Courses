describe("gameService Tests", function() {

  describe("getGames()", function() {
      // Test: Should return a successful response with a list of games
      // 1. Verify the response status is 200.
      // 2. Ensure the data is an array with a length of 3.
      // 3. Check that the first game includes the required keys: 'id', 'title', 'genre', 'year', 'developer', 'description'.
  });

  describe("addGame()", function() {
      // Test: Should add a new game successfully
      // 1. Create a valid new game object.
      // 2. Verify the response status is 201 and the success message is correct.
      // 3. Check that the newly added game appears in the game list.

      // Test: Should return an error for invalid game data
      // 1. Create an invalid game object (missing required fields).
      // 2. Check that the response status is 400 and the error message is "Invalid Game Data!".
  });

  describe("deleteGame()", function() {
      // Test: Should delete an existing game by ID
      // 1. Delete a game by its ID.
      // 2. Verify the response status is 200 and the success message is correct.
      // 3. Ensure the game is successfully removed from the list.

      // Test: Should return an error if the game is not found
      // 1. Attempt to delete a game with a non-existent ID.
      // 2. Check that the response status is 404 and the error message is "Game Not Found!".
  });

  describe("updateGame()", function() {
      // Test: Should update an existing game with new data
      // 1. Create updated game data and update an existing game by its ID.
      // 2. Verify the response status is 200 and the success message is correct.
      // 3. Ensure the updated game is reflected in the game list.

      // Test: Should return an error if the game to update is not found
      // 1. Attempt to update a game that doesn't exist.
      // 2. Check that the response status is 404 and the error message is "Game Not Found!".

      // Test: Should return an error if the new game data is invalid
      // 1. Provide incomplete or invalid data for an existing game.
      // 2. Check that the response status is 400 and the error message is "Invalid Game Data!".
  });
});
