package org.example;

public abstract class Tile {
    int tileCoordinate;
    Tile(int tileCoordinates){
        this.tileCoordinate=tileCoordinates;
    }
    public abstract boolean isTileOccupied();
    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{
        EmptyTile(int coordinate){
            super(coordinate);
        }
        @Override
        public boolean isTileOccupied(){
            return false;
        }

        @Override
        public Piece getPiece(){
            return null;
        }
    }
    public static final class OccupiedTile extends Tile{
        Piece pieceOnTile;
        OccupiedTile(int tileCoordinates,Piece pieceOnTile){
            super(tileCoordinates);
            this.pieceOnTile=pieceOnTile;
        }
        @Override public boolean isTileOccupied(){
            return true;
        }
        @Override
        public Piece getPiece(){
            return this.pieceOnTile;
        }
    }
}