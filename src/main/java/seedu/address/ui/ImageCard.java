package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import seedu.address.model.image.ImageDetails;

public class ImageCard extends UiPart<Region> {

    private static final String FXML = "ImageCard.fxml";

    public final ImageDetails imageDetails;
    public final Image image;

    @FXML
    private Label indexLabel;
    @FXML
    private ImageView imageView;

    /**
     * Creates an ImageCard component, used to display in the image list pane
     *
     * @param index the index of this imageCard relative to its parent image list pane
     * @param imageDetails the details of the image to be displayed
     * @param height height of the image
     * @param width width of the image
     */
    public ImageCard(int index, ImageDetails imageDetails, int height, int width) {
        super(FXML);
        this.imageDetails = imageDetails;
        indexLabel.setText(String.valueOf(index));
        image = new Image(imageDetails.getJavaFxImageUrl(), width, height, true, true);
        imageView.setImage(image);
    }
}