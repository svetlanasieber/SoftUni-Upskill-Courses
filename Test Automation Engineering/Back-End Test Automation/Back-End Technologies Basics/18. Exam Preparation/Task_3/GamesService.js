const gameService = {
    games: [
        { id: "1", title: "The Legend of Zelda: Breath of the Wild", genre: "Action-adventure", year: 2017, developer: "Nintendo", description: "An action-adventure game in an open world." },
        { id: "2", title: "God of War", genre: "Action-adventure", year: 2018, developer: "Santa Monica Studio", description: "An action-adventure game set in Norse mythology." },
        { id: "3", title: "The Witcher 3: Wild Hunt", genre: "RPG", year: 2015, developer: "CD Projekt Red", description: "An RPG set in a fantasy open world." }
    ],
    getGames() {
        return {
            status: 200,
            data: this.games
        };
    },
    addGame(game) {
        if (!game.id || !game.title || !game.genre || !game.year || !game.developer || !game.description) {
            return {
                status: 400,
                error: "Invalid Game Data!"
            };
        }
        this.games.push(game);
        return {
            status: 201,
            message: "Game added successfully."
        };
    },
    deleteGame(gameId) {
        const gameIndex = this.games.findIndex(game => game.id === gameId);
        if (gameIndex === -1) {
            return {
                status: 404,
                error: "Game Not Found!"
            };
        }
        this.games.splice(gameIndex, 1);
        return {
            status: 200,
            message: "Game deleted successfully."
        };
    },
    updateGame(oldId, newGame) {
        const gameIndex = this.games.findIndex(game => game.id === oldId);
        if (gameIndex === -1) {
            return {
                status: 404,
                error: "Game Not Found!"
            };
        }
        if (!newGame.id || !newGame.title || !newGame.genre || !newGame.year || !newGame.developer || !newGame.description) {
            return {
                status: 400,
                error: "Invalid Game Data!"
            };
        }
        this.games[gameIndex] = newGame;
        return {
            status: 200,
            message: "Game updated successfully."
        };
    }
};
